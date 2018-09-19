package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by alexandrumanolache on 17/09/2018.
 */

public class Millionaire {

    public static void main(String[] args) {
        System.out.println("Welcome to Who Wants to be a Millionaire!You will have to answer 10 questions correctly in a row. \n But you have 50/50 option \n So, lets begin! You have a chance to win ONE MILLION DOLLARS!!! \n");
      // intrebarea 1

        Answer answer1 = new Answer("1919");
        Answer answer2 = new Answer("1920");
        Answer answer3 = new Answer("1921");
        Answer answer4 = new Answer("1918",true);

        ArrayList <Answer> answerquestion1 = new ArrayList<>();
        answerquestion1.add(answer1);
        answerquestion1.add(answer2);
        answerquestion1.add(answer3);
        answerquestion1.add(answer4);

        Question question1 = new Question("Cand s-a unit Romania",1,answerquestion1);

        ///intrebarea 2

        Answer answer21 = new Answer("1994");
        Answer answer22 = new Answer("1998");
        Answer answer23 = new Answer("2006");
        Answer answer24 = new Answer("2002",true);

        ArrayList <Answer> answerquestion2 = new ArrayList<>();
        answerquestion1.add(answer21);
        answerquestion1.add(answer22);
        answerquestion1.add(answer23);
        answerquestion1.add(answer24);

        Question question2 = new Question("Cand a castigat Brazilia ultima data campionat Mondial",2,answerquestion2);

        ///intrebarea 3

        Answer answer31 = new Answer("1822");
        Answer answer32 = new Answer("1832");
        Answer answer33 = new Answer("1819");
        Answer answer34 = new Answer("1821",true);

        ArrayList <Answer> answerquestion3 = new ArrayList<>();
        answerquestion1.add(answer21);
        answerquestion1.add(answer22);
        answerquestion1.add(answer23);
        answerquestion1.add(answer24);

        Question question3 = new Question("Cand a murit Napoleon",3,answerquestion3);


        ///intrebarea 4

        Answer answer41 = new Answer("G Washington",true);
        Answer answer42 = new Answer("Roosvelt");
        Answer answer43 = new Answer("Obama");
        Answer answer44 = new Answer("Truman");

        ArrayList <Answer> answerquestion4 = new ArrayList<>();
        answerquestion1.add(answer21);
        answerquestion1.add(answer22);
        answerquestion1.add(answer23);
        answerquestion1.add(answer24);

        Question question4 = new Question("Primul presedinte al Americii",3,answerquestion4);

        ArrayList<Question> allquestions = new ArrayList<>();
        allquestions.add(question1);
        allquestions.add(question2);
        allquestions.add(question3);

    }

}
