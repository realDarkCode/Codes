package CodeWithHarry_Exercise.Exercise;

import java.util.Random;
import java.util.Scanner;

/**
 * ? Create a simple Rock, Paper Scissors game in Java. (#Use Conditional
 * ? Statements)
 */
public class Ex_02_Rock_paper_scissor {
    public static int generateChoice() {
        /**
         * Generate a number between 1 to 3
         * can be used as computer or user choice
         */
        int x = new Random().nextInt(4) + 1;
        return x;
    }

    public static byte isPlayerWon(byte userChoice) {
        /**
         * tells who won in a single set via user input
         * 1 : Player won the set
         * 0 : computer won the set
         * -1 : draw set
         */
        byte computerChoice = (byte) generateChoice();
        byte isWon;
        if (userChoice == 4)
            userChoice = (byte) generateChoice();
        if (userChoice == computerChoice) {
            isWon = -1;
        } else if ((userChoice == 1 && computerChoice == 2) || (userChoice == 2 && computerChoice == 3)
                || (userChoice == 3 && computerChoice == 1)) {
            isWon = 0;
        } else {
            isWon = 1;
        }
        return isWon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte round = 0, userChoice = 0, userWin = 0, computerWin = 0;
        System.out.println("Welcome to Rock Paper Scissor Game!");
        // asking player how many round he/she wanna play
        while (true) {
            System.out.println("\n\tEnter the round you want to play: (3-15");
            round = sc.nextByte();
            if ((round > 0 && round < 16))
                break;
            System.out.println("Your round number must be within 3 - 15");
        }
        // taking player choice (rock, paper, scissor)
        // main game loop
        while (round > 0) {
            System.out.println("\n\tEnter 1 For rock, 2 for paper, 3 for scissor, 4 for random");
            userChoice = sc.nextByte();
            if (!(userChoice > 0 && userChoice < 5)) {
                System.out.println("Wrong choice!");
                continue;
            }
            switch (isPlayerWon(userChoice)) {
                case 1 -> {
                    userWin++;
                    System.out
                            .println("You won!" + "(" + userWin + " vs " + computerWin + ")" + "[round left:"
                                    + (round - 1) +
                                    "]");
                }
                case 0 -> {
                    computerWin++;
                    System.out
                            .println("You lost!" + "(" + userWin + " vs " + computerWin + ")" + "[round left:"
                                    + (round - 1) +
                                    "]");
                }
                case -1 -> {
                    System.out
                            .println("set draw!" + "(" + userWin + " vs " + computerWin + ")" + "[round left:"
                                    + (round - 1) +
                                    "]");

                }

            }
            round--;
        }
        sc.close();
        // announce the result
        if (userWin == computerWin) {
            System.out.println("The overall Match has Draw " + "( " + userWin + " : " + computerWin + " )");
        } else if (userWin > computerWin) {

            System.out.println("Congratulations! You won the Match " + "( " + userWin + " : " + computerWin + " )");
        } else {

            System.out.println(
                    "You have lost the Match, better luck next time " + "( " + userWin + " : " + computerWin + " )");
        }

    }
}