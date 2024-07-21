public class Book {
String name;
String author;
int publicationYear;
String category;
String summary;
String characters;

Book(String name) {
this.name = name;
System.out.println("Name: " + name);
System.out.println("\n");
}
Book(String name, String author) {
this(name);
this.author = author;
System.out.println("Author: " + author);
System.out.println("\n");
}
Book(String name, String author, int publicationYear) {
this(name, author);
this.publicationYear = publicationYear;
System.out.println("Publication Year: " + publicationYear);
System.out.println("\n");
}
Book(String name, String author, int publicationYear, String category) {
this(name, author, publicationYear);
this.category = category;
System.out.println("Category: " + category);
System.out.println("\n");
}
Book(String name, String author, int publicationYear, String category, String summary) {
this(name, author, publicationYear, category);
this.summary = summary;
System.out.println("Summary: " + summary);
System.out.println("\n");
}
Book(String name, String author, int publicationYear, String category, String summary, String characters) {
this(name, author, publicationYear, category, summary);
this.characters = characters;
System.out.println("Characters: " + characters);
System.out.println("\n");
}
}
