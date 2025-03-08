// Import ArrayList 

import java.util.ArrayList; 

// Create Main class, acts like a client class to test GameMenu

public class Main {
    
    // Main method - where the program beings

    public static void main(String[] args) {
        
        // Create ArrayList<String> to store menu options

        ArrayList<String> actions = new ArrayList<>();

        // Add menu options to actions list

        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Create an instance of GameMenu and pass actions list to it

        GameMenu gameMenu = new GameMenu(actions);

        // Call displayMenu() method to print the menu options

        gameMenu.displayMenu();
    }
}
