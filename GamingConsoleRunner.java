public class GamingConsoleRunner {
    public static void main(String[] args) {
        GamingConsole gamingConsole1 = new GamingConsole();
        String[] features1 = {"4K Resolution", "8GB RAM", "1TB HDD"};
        GamingConsole gamingConsole2 = new GamingConsole("PlayStation", 2000, (short) 2020, 399.99f, features1);

        String[] features3 = {"8K Resolution", "16GB RAM", "2TB SSD"};
        GamingConsole gamingConsole3 = new GamingConsole("Xbox", 3000, (short) 2022, 499.99f, features3);

        String[] features4 = {"Full HD Resolution", "4GB RAM", "500GB HDD"};
        GamingConsole gamingConsole4 = new GamingConsole("Nintendo", 1000, (short) 2021, 299.99f, features4);

        String[] features5 = {"8K Resolution", "32GB RAM", "4TB SSD"};
        GamingConsole gamingConsole5 = new GamingConsole("Microsoft", 4000, (short) 2023, 599.99f, features5);
    }
}
