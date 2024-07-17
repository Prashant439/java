public class RadioRunner {
    public static void main(String[] args) {
        Radio radio1 = new Radio();
        String[] features1 = {"AM", "FM", "Bluetooth"};
        Radio radio2 = new Radio("Sony", 99, (short) 2020, features1);

        String[] features3 = {"DAB", "Internet Radio", "WiFi"};
        Radio radio3 = new Radio("Bose", 101, (short) 2022, features3);

        String[] features4 = {"AM", "FM", "USB"};
        Radio radio4 = new Radio("Panasonic", 103, (short) 2021, features4);

        String[] features5 = {"DAB+", "Internet Radio", "Voice Assistant"};
        Radio radio5 = new Radio("Tivoli", 105, (short) 2023, features5);
    }
}