import java.util.Random;
import java.util.Scanner;

class NumberGame {
    private int targetNumber;
    private int attempts;
    private int maxAttempts;

    public NumberGame(int maxAttempts) {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        attempts = 0;
        this.maxAttempts = maxAttempts;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Take guess " + (attempts + 1) + ": ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                scanner.close();
                return;
            }
        }

        System.out.println("Sorry, you've reached the maximum number of attempts.");
        System.out.println("The number I was thinking of was: " + targetNumber);
        scanner.close();
    }
}

public class NumberGameApp {
    public static void main(String[] args) {
        int maxAttempts = 5; // Maximum attempts allowed
        NumberGame numberGame = new NumberGame(maxAttempts);
        numberGame.play();
    }
}
