
public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv1 = new Television();
        String[] features1 = {"HD", "LED", "Smart TV"};
        Television tv2 = new Television("LG", 40, (short) 2020, features1);

        String[] features3 = {"4K", "OLED", "HDR"};
        Television tv3 = new Television("Sony", 55, (short) 2022, features3);

        String[] features4 = {"FHD", "QLED", "AI TV"};
        Television tv4 = new Television("Samsung", 50, (short) 2021, features4);

        String[] features5 = {"8K", "MicroLED", "Smart TV"};
        Television tv5 = new Television("TCL", 65, (short) 2023, features5);
    }
}

