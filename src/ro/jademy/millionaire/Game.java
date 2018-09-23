package ro.jademy.millionaire;

import javax.activation.MimeTypeParameterList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Game {

    private int currentLevel = 1;
    List<Question> questionList = new ArrayList<>();
    private Scanner scanner;

    public Game(List<Question> questionList,Scanner scanner) {
        this.questionList.addAll(questionList);
        this.scanner = scanner;
    }

    public void start() {

    }

    public  void getQuestionForLevel(int level) {
        System.out.println("Current level is " + currentLevel);
        for (Question question : questionList ){
            if(question.getDifficultyLevel()==currentLevel){
                question.showQuestion();
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
        return  true;
    }

}

