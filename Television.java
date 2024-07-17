public class Television {
    public String brand;
    public int screenSize;
    public short year;
    public String[] features;

    public Television() {
        System.out.println("No arguments");
    }

    public Television(String brand, int screenSize, short year, String[] features) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.year = year;
        this.features = features;
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Year: " + year);
        for (int i = 0; i < features.length; i++) {
            System.out.println("Features: " + features[i]);
        }
    }
}

