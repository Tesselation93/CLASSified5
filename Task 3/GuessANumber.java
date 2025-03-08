import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    
    // We create a Scanner object to read input from the user (declared as static so we can reuse it)
    static Scanner scanner = new Scanner(System.in);
    
    // We create a Random object to generate a random number
    static Random random = new Random();
    
    // We generate a random number between 1 and 100 and store it in the variable rnd_number
    static int rnd_number = random.nextInt(100) + 1; 

    public static void main(String[] args) {
        
        // We call the method makeAGuess() to start the game
        makeAGuess();
    }

    public static void makeAGuess() {
        
        // The customer is asked to type their guess
        System.out.println("Please type your guess: ");
        
        // We check if the input is numeric using hasNextInt()
        if (scanner.hasNextInt()) {
            
            // If the input is a valid number, we store it in the variable input
            int input = scanner.nextInt();

            // Then we check if the customer's input matches the random number
            if (input == rnd_number) {
                
                // If the input matches the random number, we print a winning message
                System.out.println("You guessed right! Yawn, how boring!");
                
                // The game ends here because we do NOT call makeAGuess() again
            } 
            
            // If the input is lower than the random number, we print a hint
            else if (input < rnd_number) {
                System.out.println("Too low! You're too slow!");
                
                // We call makeAGuess() again to allow the customer to try again
                makeAGuess();
            } 
            
            // If the input is higher than the random number, we print a hint
            else {
                System.out.println("Too high, come down, don't fly!");
                
                // We call makeAGuess() again so the customer can guess again
                makeAGuess();
            }
        } 
        else {
            // If the input is NOT a number, we tell the customer it's invalid
            System.out.println("Invalid input! Please enter a number.");
            
            // We clear the invalid input so it doesn’t cause an infinite loop
            scanner.next();
            
            // We call makeAGuess() again to let the customer enter a valid number
            makeAGuess();
        }
    }
}
