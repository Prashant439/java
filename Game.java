public class Game {
String gameName;
String developerStudio;
int releaseDate;
String gameGenre;
String gameDescription;
String leadDesigner;
Game(String gameName) {
this.gameName = gameName;
System.out.println("Game Name: " + gameName);
System.out.println("\n");
}
Game(String gameName, String developerStudio) {
this(gameName);
this.developerStudio = developerStudio;
System.out.println("Developer Studio: " + developerStudio);
System.out.println("\n");
}
Game(String gameName, String developerStudio, int releaseDate) {
this(gameName, developerStudio);
this.releaseDate = releaseDate;
System.out.println("Release Date: " + releaseDate);
System.out.println("\n");
}
Game(String gameName, String developerStudio, int releaseDate, String gameGenre) {
this(gameName, developerStudio, releaseDate);
this.gameGenre = gameGenre;
System.out.println("Game Genre: " + gameGenre);
System.out.println("\n");
}
Game(String gameName, String developerStudio, int releaseDate, String gameGenre, String gameDescription) {
this(gameName, developerStudio, releaseDate, gameGenre);
this.gameDescription = gameDescription;
System.out.println("Game Description: " + gameDescription);
System.out.println("\n");
}
Game(String gameName, String developerStudio, int releaseDate, String gameGenre, String gameDescription, String leadDesigner) {
this(gameName, developerStudio, releaseDate, gameGenre, gameDescription);
this.leadDesigner = leadDesigner;
System.out.println("Lead Designer: " + leadDesigner);
System.out.println("\n");
}
public static void main(String[] args) {
Game g = new Game("The Last of Us", "Naughty Dog", 2013, "Action-Adventure", "A post-apocalyptic survival game...", "Neil Druckmann");
}
}