import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain;

        System.out.println(" Welcome to the Number Guessing Game!");

        System.out.print("Choose difficulty (easy/medium/hard): ");
        String difficulty = sc.next().toLowerCase();
        int maxAttempts;
        switch (difficulty) {
            case "easy": maxAttempts = 10; break;
            case "medium": maxAttempts = 5; break;
            case "hard": maxAttempts = 3; break;
            default: maxAttempts = 5;
        }



        do {
            int numberToGuess = rand.nextInt(100) + 1; 
            int attempts = 0;
            boolean guessed = false;

            System.out.printf("\nGuess a number between 1 and 100. You have %d attempts.%n", maxAttempts);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.printf(" Correct! You guessed in %d attempt%s.%n", attempts, attempts > 1 ? "s" : "");
                    guessed = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessed) {
                System.out.printf(" Out of attempts! The number was %d.%n", numberToGuess);
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thanks for playing! ");
        sc.close();
    }
}

