import java.util.*;
class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean playAgain;

        do{
        int random, guess;
        random = r.nextInt(100) + 1;
        int attempts = 0;
        final int maxAttempts = 7;
        System.out.println("A number have been chosen between 1 - 100");
        System.out.println("Try to guess the number!You have 7 chance...");
        while (true) {
            System.out.print("Enter your guess: ");
            guess = s.nextInt();
            attempts++;
            if (guess == random) {
                System.out.println("Correct! You've guessed the number.");
                break;
            }
            else if (guess < random) {
                System.out.println("It's low! Try again.");
            }
            else {
                System.out.println("It's high! Try again.");
            }
        }
        if (attempts == maxAttempts) {
            System.out.println("Sorry! You've used all your attempts. The number was: " + random);
        }
        System.out.print("Do you want to play again? (yes/no): ");
            String response = s.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);
    }
}
