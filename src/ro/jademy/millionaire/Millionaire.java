package ro.jademy.millionaire;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Millionaire {

    public static void main(String[] args) {

        String name;
        Integer option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Welcome to Who Wants to be a Millionaire!You will have to answer 10 questions correctly in a row. \n But you have 50/50 option \n So, " + name+ " lets begin! You have a chance to win ONE MILLION DOLLARS!!! \n");

        System.out.println("Bucharest is the Capital of \n 1)Romania 2) Belgium  3)France 4) Spain \n");

        option = scanner.nextInt();
        System.out.println("You choose"+ option);

    }
}
