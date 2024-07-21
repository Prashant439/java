public class NikeRunner{
public static void main(String[] args) {
Nike n1 = new Nike("Navy");
Nike n2 = new Nike("Grey", "Flyknit");
Nike n3 = new Nike("Black", "Air Force", 8);
Nike n4 = new Nike("White", "Jordan", 9, "Suede");
Nike n5 = new Nike("Red", "Presto", 10, "Mesh", 69.99);
Nike n6 = new Nike("Purple", "Vapormax", 11, "Synthetic", 89.99, "Limited Edition");
System.out.println("Nike 1: " + n1.shade);
System.out.println("Nike 2: " + n2.shade + ", " + n2.design);
System.out.println("Nike 3: " + n3.shade + ", " + n3.design + ", " + n3.dimension);
System.out.println("Nike 4: " + n4.shade + ", " + n4.design + ", " + n4.dimension + ", " + n4.substance);
System.out.println("Nike 5: " + n5.shade + ", " + n5.design + ", " + n5.dimension + ", " + n5.substance + ", $" + n5.cost);
System.out.println("Nike 6: " + n6.shade + ", " + n6.design + ", " + n6.dimension + ", " + n6.substance + ", $" + n6.cost + ", " + n6.assortment);
}
}