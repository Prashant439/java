
public class Tablet1 {
    public String brand;
    public int storage;
    public short year;
    public float price;
    public String[] features;

    public Tablet() {
        System.out.println("No arguments");
    }

    public Tablet(String brand, int storage, short year, float price, String[] features) {
        this.brand = brand;
        this.storage = storage;
        this.year = year;
        this.price = price;
        this.features = features;
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        for (int i = 0; i < features.length; i++) {
            System.out.println("Features: " + features[i]);
        }
    }
}

