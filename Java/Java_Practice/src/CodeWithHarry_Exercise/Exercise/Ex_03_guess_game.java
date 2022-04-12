
import java.util.Random;
import java.util.Scanner;

/**
 * Create a class Game, which allows a user to play "Guess the Number" game
 * once.
 * 
 * Game should have the following methods:
 * Constructor to generate the random number
 * takeUserInput() to take a user input of number
 * isCorrectNumber() to detect whether the number entered by the user is true
 * getter and setter for noOfGuesses
 */
class GuessGame {
    private int number, userGuess, noOfGuesses;
    boolean isUserWon = false;
    Scanner input = new Scanner(System.in);

    GuessGame() {
        printGameInfo();
        String difficulty;
        System.out.println("enter the difficulty: (easy || medium || hard || ultra-hard");
        difficulty = this.input.next();
        switch (difficulty.toLowerCase()) {
            case "easy":
            case "medium":
            case "hard":
            case "ultra-hard":
                generateNumber(difficulty);
                System.out.println("game mode has been set to " + difficulty);
                break;
            default:
                difficulty = "easy";
                generateNumber("easy");
                System.out.println(" wrong choice !! game mode has been set to easy");
                break;
        }
        System.out.println("you will have only " + noOfGuesses + " guess");
        gameLoop(difficulty);
    }

    GuessGame(String difficulty) {
        printGameInfo();
        generateNumber(difficulty);
        switch (difficulty.toLowerCase()) {
            case "easy":
            case "medium":
            case "hard":
            case "ultra-hard":
                generateNumber(difficulty);
                System.out.println("game mode has been set to " + difficulty);
                break;
            default:
                difficulty = "easy";
                generateNumber("easy");
                System.out.println(" wrong choice !! game mode has been set to easy");
                break;
        }
        System.out.println("you will have only " + noOfGuesses + " guess");
        gameLoop(difficulty);
    }

    // generate a random number for game based on given difficulty
    private void generateNumber(String difficulty) {
        Random generator = new Random();
        switch (difficulty) {
            case "easy" -> {
                this.number = generator.nextInt(21);
                this.noOfGuesses = 5;

            }
            case "medium" -> {
                this.number = generator.nextInt(51);
                this.noOfGuesses = 10;
            }
            case "hard" -> {
                this.number = generator.nextInt(101);
                this.noOfGuesses = 10;
            }
            case "ultra-hard" -> {
                this.number = generator.nextInt(101);
                this.noOfGuesses = 3;
            }
        }
    }

    private void gameLoop(String difficulty) {
        switch (difficulty) {
            case "easy" -> {
                System.out.println("The number will be between 0-20, you will have 5 guess");
            }
            case "medium" -> {
                System.out.println("The number will be between 0-50, you will have 10 guess");
            }
            case "hard" -> {
                System.out.println("The number will be between 0-100, you will have 10 guess");

            }
            case "ultra-hard" -> {
                System.out.println("The number will be between 0-100, you will have 3 guess");
            }

        }

        while (getNoOfGuesses() > 0) {
            takeUserGuess();
            decreaseNoOfGuesses();
            System.out.println("You have left " + getNoOfGuesses() + " guess");
            giveHint();
            if (getUserWon()) {
                break;
            }
        }
        announceResult();
        this.input.close();

    }

    // static method
    static void printGameInfo() {
        System.out.println("\t\tWelcome to Guess game");
        System.out.println("\tIn this game you have to guess a number depend on you set difficulty");
    }

    // method
    private void giveHint() {
        if (getUserGuess() > getNumber()) {
            System.out.println("try to guess a Smaller number");
        } else if (getNumber() > getUserGuess()) {
            System.out.println("try to guess a Bigger number");

        } else {
            System.out.println("Bingo you got it!!");
            userWon();
        }
    }

    private void announceResult() {
        if (getUserWon()) {
            System.out.println("Congratulation You won the match");
        } else {
            System.out.println("You have lost the match");
        }
        System.out.println("The number was " + getNumber());
    }

    // getter
    private int getNoOfGuesses() {
        return this.noOfGuesses;
    }

    private int getUserGuess() {
        return this.userGuess;
    }

    private int getNumber() {
        return this.number;
    }

    private boolean getUserWon() {
        return this.isUserWon;
    }

    // setter
    private void decreaseNoOfGuesses() {
        --this.noOfGuesses;

    }

    private void userWon() {
        this.isUserWon = true;
    }

    private void takeUserGuess() {
        this.userGuess = this.input.nextInt();
    }
}

public class Ex_03_guess_game {
    public static void main(String[] args) {
        new GuessGame();
    }
}
