// Import ArrayList so we can use it

import java.util.ArrayList; 

// Create class called GameMenu, which represents the menu for the game

public class GameMenu {

    // Create private instance variable called actions of type ArrayList<String> - stores menu options 

    private ArrayList<String> actions;

    // Create a constructor that accepts an ArrayList<String> as a parameter - creates GameMenu object with existing 
    
    public GameMenu(ArrayList<String> actions) {

        // Assign the passed-in list to the instance variable actions

        this.actions = actions;
    }

    // Create a method called displayMenu() to print out the menu options

    public void displayMenu() {

        // Use a for-each loop to go through each action in the actions list

        for (String action : actions) {
        
        // Print each action to the console
            
            System.out.println(action);
        }
    }
}
