package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Question {
    private String question;
    private int difficultyLevel; //max 15
    private List<Answer> answerList = new ArrayList<>();

    public Answer getCorrectAnswer() {
        for (Answer answer : answerList) {
            if (answer.isCorrect()) {
                return answer;
            }
        }
        return null;
    }

    public Question(String question, int difficultyLevel, List<Answer> answerList) {
        this.question = question;
        this.difficultyLevel = difficultyLevel;
        this.answerList = answerList;
    }

    public void showQuestion() {
            System.out.println(question.toString());
            for(int i=0;i<answerList.size();i++){
            System.out.println(i+1+") "+answerList.get(i));
        }
    }

    public String getQuestion() {
        return question;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    @Override
    public String toString() {
        return "Question{" +
            "question='" + question + '\'' +
            ", difficultyLevel=" + difficultyLevel +
            ", answerList=" + answerList +
            '}';
    }
}
