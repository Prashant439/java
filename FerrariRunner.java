
public class FerrariRunner{
public static void main(String[] args) {
Ferrari f1 = new Ferrari("Red");
Ferrari f2 = new Ferrari("Blue", "Spider");
Ferrari f3 = new Ferrari("Black", "F430", 2005);
Ferrari f4 = new Ferrari("White", "California", 2010, "Leather");
Ferrari f5 = new Ferrari("Grey", "488 GTB", 2015, "Carbon Fiber", 250000);
Ferrari f6 = new Ferrari("Yellow", "LaFerrari", 2013, "Hybrid", 300000, "Navigation, Heated Seats");
System.out.println("Ferrari 1: " + f1.color);
System.out.println("Ferrari 2: " + f2.color + ", " + f2.model);
System.out.println("Ferrari 3: " + f3.color + ", " + f3.model + ", " + f3.year);
System.out.println("Ferrari 4: " + f4.color + ", " + f4.model + ", " + f4.year + ", " + f4.material);
System.out.println("Ferrari 5: " + f5.color + ", " + f5.model + ", " + f5.year + ", " + f5.material + ", $" + f5.price);
System.out.println("Ferrari 6: " + f6.color + ", " + f6.model + ", " + f6.year + ", " + f6.material + ", $" + f6.price + ", " + f6.features);
}
}