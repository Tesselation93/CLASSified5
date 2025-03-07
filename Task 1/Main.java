import java.util.ArrayList;

// Main class

class Main {

    // Main method

    public static void main(String[] args) {

        // In main method create an instance of the team class

        Team team1 = new Team("Uno");
        Team team2 = new Team("Dos");
        Team team3 = new Team("Tres");
        Team team4 = new Team("Cuatro");
        Team team5 = new Team("Cinco");

        // Setting ranks 

        team1.setRank(2);
        team2.setRank(1);
        team3.setRank(3);
        team4.setRank(5);
        team5.setRank(4);

        // Adding players to the team

        team1.addPlayer(new String[] {"Coco", "Muffin", "Crystal", "Sugar", "Candy"});
        team2.addPlayer(new String[] {"Larry", "Fine", "Curly", "Howard", "Mo"});
        team3.addPlayer(new String[] {"DeRita", "Shemp", "Malice", "Healy", "Shubert"});
        team4.addPlayer(new String[] {"Arbuckle", "Jerry", "Marge", "Myrt", "Ted"});
        team5.addPlayer(new String[] {"Leonard", "Cohen", "Ritz", "Cohn", "Okuda"});

        // Printing all teams - their toString() methods will be used automatically

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team5);
    }
}