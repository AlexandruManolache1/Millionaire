package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alexandrumanolache on 17/09/2018.
 */
public class Game {

    private static final int MAX_LEVEL = 15;
    private int currentLevel = 1;
    private boolean fiftyFiftyCalled = false;
    private List<Question> questionList = new ArrayList<>();
    private Scanner scanner;

    public Game(List<Question> questionList, Scanner scanner) {
        this.questionList.addAll(questionList);
        this.scanner = scanner;
    }

    public void start() {
        do {
            getQuestionForLevel(currentLevel);
        }
        while (currentLevel == MAX_LEVEL);
    }

    public void getQuestionForLevel(int level) {
        for (Question question : questionList) {
            if (question.getDifficultyLevel() == currentLevel) {
                System.out.println("Current level is " + currentLevel);
                question.showQuestion();
                //citim inputul jucatorului
                String answerGiven = scanner.next();
                // System.out.println("you choose option " + answerGiven + " " + question.getCorrectAnswer().getAnswer());
                if (question.getCorrectAnswer().getAnswer().equals(answerGiven)) {
                    System.out.println("Correct");
                    currentLevel = currentLevel + 1;
                } else {
                    if (answerGiven.equals("Fifty")) {
                        question.fiftyFifty();
                        String answerGiven2 = scanner.next();
                        // System.out.println("you choose option " + answerGiven + " " + question.getCorrectAnswer().getAnswer());
                        if (question.getCorrectAnswer().getAnswer().equals(answerGiven2)) {
                            System.out.println("Correct");
                            currentLevel = currentLevel + 1;
                        }
                    } else {
                        System.out.println("Incorrect. Game Finished");
                        break;
                    }
                }
            }

        }
    }


    public void getAnswear(Question question, String answerGiven) {
        if (!fiftyFiftyCalled && answerGiven.equals("Fifty")) {
            //verify that the user did not called fifty fift again
                question.fiftyFifty();
                fiftyFiftyCalled = true;
                getAnswear(question, answerGiven);
            }
            // System.out.println("you choose option " + answerGiven + " " + question.getCorrectAnswer().getAnswer());
            if (question.getCorrectAnswer().getAnswer().equals(answerGiven)) {
                System.out.println("Correct");
                currentLevel = currentLevel + 1;
            }
        }

        public int getCurrentLevel () {
            return currentLevel;
        }

        public void setOption ( int option){
            option = option;
        }

        public boolean isFinished () {
            return currentLevel == MAX_LEVEL;
        }

    }