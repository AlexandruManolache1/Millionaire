package ro.jademy.millionaire;

import javax.activation.MimeTypeParameterList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Game {

    private static final int MAX_LEVEL = 15;
    private int currentLevel = 1;
    List<Question> questionList = new ArrayList<>();
    private Scanner scanner;

    public Game(List<Question> questionList,Scanner scanner) {
        this.questionList.addAll(questionList);
        this.scanner = scanner;
    }

    public void start() {
        for (int i = 0; i < MAX_LEVEL;i++)
        {
           getQuestionForLevel(i);
        }
    }

    public  void getQuestionForLevel(int level) {
        System.out.println("Current level is " + currentLevel);
        for (Question question : questionList ){
            if(question.getDifficultyLevel()==currentLevel){
                question.showQuestion();

                //citim inputul jucatorului
            }
        }
    }

    public void fiftyFifty() {
        //show the same question but with only two possible answers
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setOption(int option) {
        option = option;
    }

    public  boolean isFinished(){
        return  currentLevel== MAX_LEVEL;
    }

}