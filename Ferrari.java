public class Ferrari {
String color;
String model;
int year;
String material;
double price;
String features;
Ferrari(String color) {
this.color = color;
}
Ferrari(String color, String model) {
this.color = color;
this.model = model;
}
Ferrari(String color, String model, int year) {
this.color = color;
this.model = model;
this.year = year;
}
Ferrari(String color, String model, int year, String material) {
this.color = color;
this.model = model;
this.year = year;
this.material = material;
}
Ferrari(String color, String model, int year, String material, double price) {
this.color = color;
this.model = model;
this.year = year;
this.material = material;
this.price = price;
}
Ferrari(String color, String model, int year, String material, double price, String features) {
this.color = color;
this.model = model;
this.year = year;
this.material = material;
this.price = price;
this.features = features;
}
}