
public class Radio {
    public String brand;
    public int frequency;
    public short year;
    public String[] features;

    public Radio() {
        System.out.println("No arguments");
    }

    public Radio(String brand, int frequency, short year, String[] features) {
        this.brand = brand;
        this.frequency = frequency;
        this.year = year;
        this.features = features;
        System.out.println("Brand: " + brand);
        System.out.println("Frequency: " + frequency);
        System.out.println("Year: " + year);
        for (int i = 0; i < features.length; i++) {
            System.out.println("Features: " + features[i]);
        }
    }
}
