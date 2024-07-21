public class Sony {
String device;
String processorType;
int storageCapacity;
int batteryLife;
String displayResolution;
Sony(String device, String processorType, int storageCapacity, int batteryLife, String displayResolution) {
this.device = device;
this.processorType = processorType;
this.storageCapacity = storageCapacity;
this.batteryLife = batteryLife;
this.displayResolution = displayResolution;
System.out.println(device+","+processorType+","+storageCapacity+","+batteryLife+","+displayResolution);
}
public static void main(String[] args) {
Sony s1 = new Sony("Xperia", "Snapdragon", 128, 12, "4K");
Sony s2 = new Sony("PlayStation", "AMD Ryzen", 512, 8, "8K");
Sony s3 = new Sony("Bravia", "Android TV", 256, 10, "FHD");
Sony s4 = new Sony("Vaio", "Intel Core", 1024, 14, "UHD");
Sony s5 = new Sony("Walkman", "Sony CXD", 64, 16, "HD");
}
}
