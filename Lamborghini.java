
public class Lamborghini {
String hue;
String variant;
int productionYear;
String bodyMaterial;
double cost;
String specifications;
Lamborghini(String hue) {
this.hue = hue;
}
Lamborghini(String hue, String variant) {
this.hue = hue;
this.variant = variant;
}
Lamborghini(String hue, String variant, int productionYear) {
this.hue = hue;
this.variant = variant;
this.productionYear = productionYear;
}
Lamborghini(String hue, String variant, int productionYear, String bodyMaterial) {
this.hue = hue;
this.variant = variant;
this.productionYear = productionYear;
this.bodyMaterial = bodyMaterial;
}
Lamborghini(String hue, String variant, int productionYear, String bodyMaterial, double cost) {
this.hue = hue;
this.variant = variant;
this.productionYear = productionYear;
this.bodyMaterial = bodyMaterial;
this.cost = cost;
}
Lamborghini(String hue, String variant, int productionYear, String bodyMaterial, double cost, String specifications) {
this.hue = hue;
this.variant = variant;
this.productionYear = productionYear;
this.bodyMaterial = bodyMaterial;
this.cost = cost;
this.specifications = specifications;
}
public static void main(String[] args) {
Lamborghini l1 = new Lamborghini("Orange");
Lamborghini l2 = new Lamborghini("Green", "Huracan");
Lamborghini l3 = new Lamborghini("Black", "Aventador", 2015);
Lamborghini l4 = new Lamborghini("White", "Urus", 2018, "Aluminum");
Lamborghini l5 = new Lamborghini("Grey", "Sian", 2020, "Carbon Fiber", 400000);
Lamborghini l6 = new Lamborghini("Yellow", "Veneno", 2013, "Hybrid", 500000, "All Wheel Drive, ABS");
System.out.println("Lamborghini 1: " + l1.hue);
System.out.println("Lamborghini 2: " + l2.hue + ", " + l2.variant);
System.out.println("Lamborghini 3: " + l3.hue + ", " + l3.variant + ", " + l3.productionYear);
System.out.println("Lamborghini 4: " + l4.hue + ", " + l4.variant + ", " + l4.productionYear + ", " + l4.bodyMaterial);
System.out.println("Lamborghini 5: " + l5.hue + ", " + l5.variant + ", " + l5.productionYear + ", " + l5.bodyMaterial + ", $" + l5.cost);
System.out.println("Lamborghini 6: " + l6.hue + ", " + l6.variant + ", " + l6.productionYear + ", " + l6.bodyMaterial + ", $" + l6.cost + ", " + l6.specifications);
}
}
