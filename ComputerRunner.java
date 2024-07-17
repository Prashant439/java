public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        String[] features1 = {"Intel Core i5", "8GB RAM", "1TB HDD"};
        Computer computer2 = new Computer("Dell", 16, (short) 2020, 999.99f, features1);

        String[] features3 = {"AMD Ryzen 7", "16GB RAM", "2TB SSD"};
        Computer computer3 = new Computer("HP", 32, (short) 2022, 1299.99f, features3);

        String[] features4 = {"Intel Core i3", "4GB RAM", "500GB HDD"};
        Computer computer4 = new Computer("Lenovo", 8, (short) 2021, 699.99f, features4);

        String[] features5 = {"AMD Ryzen 9", "32GB RAM", "4TB SSD"};
        Computer computer5 = new Computer("Apple", 64, (short) 2023, 1999.99f, features5);
    }
}