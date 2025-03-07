// Create Team class

class Team {

    // Store team name's in private string

    private String teamName;

    // Private variable to store team rank in a nr - int

    private int teamRank;

    // A private array list to store player names

    private ArrayList<String> players = new ArrayList<>();

    // Constructor - it runs when we create a new Team

    public Team(String teamName) {

        // Set the team's name to whatever name was given

        this.name = teamName;
    }

    // Method to set team rank

    public void setRank(int teamRank) {

        // Store rank inside in the rank variable

        this.rank = teamRank;
    }

    // Add a toString() method that returns a String

    @Override

    public String toString() {
        return String.format("You are on team: " + teamName + " Rank: " + teamRank + "Members of team: " + playerNames);
}
    // Method to add players to the team

    public void addPlayer(String[] playerNames) {
        
    // Add player name to the players list

        for (String player : playerNames) {
            players.add(player);
        }
    }
}