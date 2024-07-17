public class Tablet1Runner {
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet();
        String[] features1 = {"Android 12", "4GB RAM", "12MP Camera"};
        Tablet tablet2 = new Tablet("Samsung", 128, (short) 2020, 399.99f, features1);

        String[] features3 = {"iOS 15", "6GB RAM", "16MP Camera"};
        Tablet tablet3 = new Tablet("Apple", 256, (short) 2022, 599.99f, features3);

        String[] features4 = {"Android 11", "3GB RAM", "8MP Camera"};
        Tablet tablet4 = new Tablet("Google", 64, (short) 2021, 299.99f, features4);

        String[] features5 = {"Android 13", "8GB RAM", "20MP Camera"};
        Tablet tablet5 = new Tablet("Amazon", 512, (short) 2023, 499.99f, features5);
    }
}
