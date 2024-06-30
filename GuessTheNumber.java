import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int ComputerGuess = random.nextInt(100)+1;
        int limit = 15;

        for (int i = 1; i <= limit; i++) {
            System.out.println("Guess a number between 1 and 100:");
            int GuessNumber = input.nextInt();

            if (GuessNumber == ComputerGuess) {
                System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                break;
            } else if (GuessNumber > ComputerGuess && GuessNumber <= 100 && GuessNumber >= 1) {
                limit--;
                System.out.println("Your guess is too high.\nRemaining attempts: " + limit);
                System.out.println("\n");
            } else if (GuessNumber < ComputerGuess && GuessNumber <= 100 && GuessNumber >= 1) {
                limit--;
                System.out.println("Your guess is too low.\nRemaining attempts: " + limit);
                System.out.println("\n");
            } else {
                limit--;
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                System.out.println("\n");
            }
        }
    }
}
