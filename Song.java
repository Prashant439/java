public class Song {
String songTitle;
String artistName;
int releaseYear;
String genreType;
String lyricsText;
String producerName;
Song(String songTitle) {
this.songTitle = songTitle;
System.out.println("Song Title: " + songTitle);
System.out.println("\n");
}
Song(String songTitle, String artistName) {
this(songTitle);
this.artistName = artistName;
System.out.println("Artist Name: " + artistName);
System.out.println("\n");
}
Song(String songTitle, String artistName, int releaseYear) {
this(songTitle, artistName);
this.releaseYear = releaseYear;
System.out.println("Release Year: " + releaseYear);
System.out.println("\n");
}
Song(String songTitle, String artistName, int releaseYear, String genreType) {
this(songTitle, artistName, releaseYear);
this.genreType = genreType;
System.out.println("Genre Type: " + genreType);
System.out.println("\n");
}
Song(String songTitle, String artistName, int releaseYear, String genreType, String lyricsText) {
this(songTitle, artistName, releaseYear, genreType);
this.lyricsText = lyricsText;
System.out.println("Lyrics Text: " + lyricsText);
System.out.println("\n");
}
Song(String songTitle, String artistName, int releaseYear, String genreType, String lyricsText, String producerName) {
this(songTitle, artistName, releaseYear, genreType, lyricsText);
this.producerName = producerName;
System.out.println("Producer Name: " + producerName);
System.out.println("\n");
}

}