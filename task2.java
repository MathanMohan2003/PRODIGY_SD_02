package prodigy;
import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        int guess = 0;
        
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
        
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }
        
        System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly!");
        System.out.println("It took you " + attempts + " attempts.");
        
        scanner.close();
    }
}
