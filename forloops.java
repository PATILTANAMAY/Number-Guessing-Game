import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (userGuess != numberToGuess) {
            userGuess = sc.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        sc.close();
    }
}
