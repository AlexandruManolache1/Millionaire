package ro.jademy.millionaire;

import java.util.Scanner;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Game {

    private int currentLevel=1;
    private int option;

    public  void start() {

    }
    public void askQuestion(){
        //show question on screen

    }
    public void answerQuestion(){
        //get user input and check if corect


    }
    public void fiftyFifty(){
        //show the same question but with only two possible answers
    }

    public  int getCurrentLevel()
    {
        return  currentLevel;
    }
    public  void setOption (int option){
        option = option;
    }

    public Game(int currentLevel, int option) {
        this.currentLevel = currentLevel;
        this.option = option;
    }
}

