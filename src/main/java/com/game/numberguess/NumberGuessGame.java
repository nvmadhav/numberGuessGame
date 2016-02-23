package com.game.numberguess;

import java.util.Scanner;

/**
 * This class is used to run the number guess game. User has to follow the interactive questions and
 * System will find out the user selected number using binary search algorithm
 */
public class NumberGuessGame {
    private static final String READY = "READY";

    private void startGame(Scanner scan) {
        NumberGuessGenerator generator = new NumberGuessGenerator();
        int lowerLimit = 1;
        int upperLimit = 100;
        String inputResult = "";
        try {
        System.out.println("ENTER THE UPPER LIMIT TO THE NUMBER RANGE:");
        upperLimit = scan.nextInt();
        System.out.println("SELECT A NUMBER IN YOUR MIND WITHIN RANGE FROM" + lowerLimit + " TO " + upperLimit);
        NumberGuess numberGuess = new NumberGuess(lowerLimit, upperLimit);

            while (!inputResult.equalsIgnoreCase("YES")) {
                numberGuess.setResultText(inputResult);
                numberGuess = generator.getNextGuess(numberGuess);
                System.out.println("Is the Number " + numberGuess.getNextGuess() + "? Please say HIGH / LOW / YES: ");
                inputResult = scan.next();
            }
        } catch (Exception e) {
            System.out.println("System Error Occured and Game is stopped now. " +
                    "Please Make sure you select proper choices while playing the game.");
        } finally {
            System.out.println("Do you want to restart the game? Y/N:");
            Scanner scanner = new Scanner(System.in);
            String restartInd = scanner.next();
            if (restartInd.equalsIgnoreCase("Y")) {
                initiateGame();
            } else {
                System.out.println("Thank you for playing this game");
            }
        }


    }

    /**
     * This method initiates the game by prompting the user to enter READY to play
     */
    private void initiateGame() {
        System.out.println("WELCOME TO NUMBER GUESS PROGRAM. PLEASE READ BELOW INSTRUCTIONS BEFORE YOU START THE GAME");

        System.out.println("USER HAS TO TYPE READY TO BEGIN THE GAME AND THEN SELECT THE UPPER LIMIT OF THE RANGE TO PLAY THIS GAME (eg: 10,100,1000). " +
                "ONCE USER SELECTS THE UPPER LIMIT SYSTEM PROMPTS THE USER WITH A NUMBER GUESS AND USER HAS TO ENTER HIGH, LOW OR YES");
        System.out.println("Please Type READY when you want to start the game:");
        Scanner scan = new Scanner(System.in);
        String inputText = scan.next();
        if (inputText.equalsIgnoreCase(READY)) {
            startGame(scan);
        }
    }

    public static void main(String[] args) {
        NumberGuessGame game = new NumberGuessGame();
        game.initiateGame();
    }
}


