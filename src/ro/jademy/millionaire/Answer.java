package ro.jademy.millionaire;

import java.util.ArrayList;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Answer {

    private String answer;
    private boolean isCorrect;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Answer answer = (Answer) o;

        if (isCorrect != answer.isCorrect) {
            return false;
        }
        return this.answer != null ? this.answer.equals(answer.answer) : answer.answer == null;
    }

    @Override
    public int hashCode() {
        int result = answer != null ? answer.hashCode() : 0;
        result = 31 * result + (isCorrect ? 1 : 0);
        return result;
    }


    public Answer(String answer, boolean isCorrect) {
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    public Answer(String answer) {
        this.answer = answer;
        this.isCorrect = false;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}


