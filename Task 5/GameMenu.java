// Import ArrayList 
import java.util.ArrayList; 
// Import Scanner to handle user input
import java.util.Scanner; 

// Create class called GameMenu
public class GameMenu {

    // Create private instance variable called actions of type ArrayList<String> - stores menu options
    private ArrayList<String> actions;

    // Create a constructor that accepts an ArrayList<String> as a parameter - creates GameMenu object with existing actions list
    public GameMenu(ArrayList<String> actions) {

        // Assign list to the instance variable actions
        this.actions = actions;
    }

    // Create method displayMenu() to print out the menu options
    public void displayMenu() {

        // Use a for-each loop to go through each action in the actions list
        for (String action : actions) {
        
            // Print each action to console
            System.out.println(action);
        }
    }

    // Create method getAction() to ask user for choice and return the action
    public int getAction() {
        
    // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);  

        // Ask user for choice
        System.out.println("Please enter the number of your choice: ");
        int userChoice = scanner.nextInt();  // Get user input as an integer

        // Return the user choice
        return userChoice;
    }

    // Create a method called doAction() to perform an action based on the user's choice
    public void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game...");
             
                break;
            case 2:
                System.out.println("Resuming the game...");
         
                break;
            case 3:
                System.out.println("Pausing the game...");
               
                break;
            case 4:

                System.out.println("Ending the game...");
              
            break;

        default:

                System.out.println("Invalid choice");
        }
    }
}
