package ro.jademy.millionaire;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Question {

    private static final int MAX_LEVEL = 15;
    private String question;
    private int difficultyLevel; //max 15
    private List <Answer> answerList = new ArrayList<>();

    public Answer getCorrectAnswer(){
        for (Answer answer:answerList) {

            if (answer.isCorrect()) {
                return answer;
            }
        }
        return  null;
    }

    public Question(String question, int difficultyLevel, List <Answer> answerList) {
        this.question = question;
        this.difficultyLevel = difficultyLevel;
        this.answerList = answerList;
    }

    public  String getQuestion()
    {
        return  question;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public  List<Answer> getAnswerList()
    {
        return  answerList;
    }
}
