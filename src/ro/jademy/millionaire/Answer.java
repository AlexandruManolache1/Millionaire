package ro.jademy.millionaire;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Answer {
    String Answer;
    boolean isCorrect;

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
        return Answer != null ? Answer.equals(answer.Answer) : answer.Answer == null;
    }

    @Override
    public int hashCode() {
        int result = Answer != null ? Answer.hashCode() : 0;
        result = 31 * result + (isCorrect ? 1 : 0);
        return result;
    }
}


