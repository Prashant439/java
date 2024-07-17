
public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone();
        String[] features1 = {"Android 12", "4GB RAM", "12MP Camera"};
        Smartphone smartphone2 = new Smartphone("Samsung", 128, (short) 2020, 799.99f, features1);

        String[] features3 = {"iOS 15", "6GB RAM", "16MP Camera"};
        Smartphone smartphone3 = new Smartphone("Apple", 256, (short) 2022, 999.99f, features3);

        String[] features4 = {"Android 11", "3GB RAM", "8MP Camera"};
        Smartphone smartphone4 = new Smartphone("Google", 64, (short) 2021, 599.99f, features4);

        String[] features5 = {"Android 13", "8GB RAM", "20MP Camera"};
        Smartphone smartphone5 = new Smartphone("OnePlus", 512, (short) 2023, 1299.99f, features5);
    }
}

