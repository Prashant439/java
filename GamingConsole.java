public class GamingConsole {
    public String brand;
    public int storage;
    public short year;
    public float price;
    public String[] features;

    public GamingConsole() {
        System.out.println("No arguments");
    }

    public GamingConsole(String brand, int storage, short year, float price, String[] features) {
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
