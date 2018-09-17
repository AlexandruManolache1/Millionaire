package ro.jademy.millionaire;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Question {

    private static final int MAX_LEVEL = 15;

    String question;
    int difficultyLevel; //max 15
    List <Answer> answerList = new ArrayList<>();

    public Answer getCorrectAnswer(){
        for (Answer answer:answerList) {

            if (answer.isCorrect) {
                return answer;
            }
        }
        return  null;
    }
}
