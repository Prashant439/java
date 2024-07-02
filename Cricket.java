public class Cricket {
    public static void calculateRunRate(String playerName, int totalScore, int totalOvers) {
        double runRate = (totalScore / totalOvers) * 6; 
        System.out.println("Player Name: " + playerName);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Total Overs: " + totalOvers);
        System.out.println("Run Rate: " + String.format("%.2f", runRate) + " runs per over");
		System.out.println(" ");
    }
	    public static void displayMatchResult(String team1, String team2, int score1, int score2) {
        String result;
        if (score1 > score2) {
            result = team1 + " wins!";
        } else if (score2 > score1) {
            result = team2 + " wins!";
        } else {
            result = "Match tied!";
        }
        System.out.println("Match Result:");
        System.out.println(team1 + ": " + score1);
        System.out.println(team2 + ": " + score2);
        System.out.println(result);
		System.out.println(" ");
    }

    public static void displayTeamPlayers(String... players) {
        System.out.println("Team Players:");
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i]);
			
        }
    }
	    public static void displayPlayerDetails(String name, int age, double height, double weight, String education, int matches, int totalScore) {
			System.out.println(" ");
        System.out.println("Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Education: " + education);
        System.out.println("Number of Matches: " + matches);
        System.out.println("Total Score: " + totalScore);
    }
}




