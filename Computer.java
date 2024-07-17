public class Computer {
    public String brand;
    public int ram;
    public short year;
    public float price;
    public String[] features;

    public Computer() {
        System.out.println("No arguments");
    }

    public Computer(String brand, int ram, short year, float price, String[] features) {
        this.brand = brand;
        this.ram = ram;
        this.year = year;
        this.price = price;
        this.features = features;
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        for (int i = 0; i < features.length; i++) {
            System.out.println("Features: " + features[i]);
        }
    }
}
