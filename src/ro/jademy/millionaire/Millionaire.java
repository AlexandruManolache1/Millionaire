package ro.jademy.millionaire;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */

public class Millionaire {

    private static List<Question> question1 = new ArrayList<>();
    private static List<Question> question2 = new ArrayList<>();
    private static List<Question> question3 = new ArrayList<>();


    public static void main(String[] args) {

        initQuestions();
        ArrayList<Question> gameQuestions = getGameQuestions();
        Scanner scan  = new Scanner(System.in);

        System.out.println("Welcome to Who Wants to be a Millionaire!Y \n");

        Game game = new Game(gameQuestions,scan);
        do {
            game.start();
        }
        while (game.isFinished());//is finished not developed yet
    }

    private static void initQuestions() {

        // intrebarea 1

        Answer answer11 = new Answer("1919");
        Answer answer12 = new Answer("1920");
        Answer answer13 = new Answer("1921");
        Answer answer14 = new Answer("1918", true);

        ArrayList<Answer> answerquestion1 = new ArrayList<>();
        answerquestion1.add(answer11);
        answerquestion1.add(answer12);
        answerquestion1.add(answer13);
        answerquestion1.add(answer14);

       Question question11 = new Question("Cand s-a unit Romania", 1, answerquestion1);
        question1.add(question11);

        ///intrebarea 2

        Answer answer21 = new Answer("1994");
        Answer answer22 = new Answer("1998");
        Answer answer23 = new Answer("2006");
        Answer answer24 = new Answer("2002", true);

        ArrayList<Answer> answerquestion2 = new ArrayList<>();
        answerquestion2.add(answer21);
        answerquestion2.add(answer22);
        answerquestion2.add(answer23);
        answerquestion2.add(answer24);

        Question question22 = new Question("Cand a castigat Brazilia ultima data campionat Mondial", 2, answerquestion2);
        question2.add(question22);

        ///intrebarea 3

        Answer answer31 = new Answer("1822");
        Answer answer32 = new Answer("1832");
        Answer answer33 = new Answer("1819");
        Answer answer34 = new Answer("1821", true);

        ArrayList<Answer> answerquestion3 = new ArrayList<>();
        answerquestion3.add(answer31);
        answerquestion3.add(answer32);
        answerquestion3.add(answer33);
        answerquestion3.add(answer34);

        Question question33 = new Question("Cand a murit Napoleon", 3, answerquestion3);

        ///intrebarea 4

        Answer answer41 = new Answer("GW", true);
        Answer answer42 = new Answer("Roosvelt");
        Answer answer43 = new Answer("Obama");
        Answer answer44 = new Answer("Truman");

        ArrayList<Answer> answerquestion4 = new ArrayList<>();
        answerquestion4.add(answer41);
        answerquestion4.add(answer42);
        answerquestion4.add(answer43);
        answerquestion4.add(answer44);

        Question question43 = new Question("Primul presedinte al Americii", 3, answerquestion4);

        question3.add(question33);
        question3.add(question43);

    }

    private static ArrayList<Question> getGameQuestions(){

        ArrayList<Question>gameQuestions  = new ArrayList<>();
        Random r = new Random();

        int randomLevel1Index = r.nextInt(question1.size());
        gameQuestions.add(question1.get(randomLevel1Index));

        int randomLevel2Index = r.nextInt(question2.size());
        gameQuestions.add(question2.get(randomLevel2Index));

        int randomLevel3Index = r.nextInt(question3.size());
        gameQuestions.add(question3.get(randomLevel3Index));

        return gameQuestions;

    }

}

