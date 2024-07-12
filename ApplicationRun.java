

public class ApplicationRun {
public static void main(String[] args) {
System.out.println(Application.init());
System.out.println(Application.init("MyApp"));
System.out.println(Application.init("MyApp", "1.0"));
System.out.println(Application.init("MyApp", "1.0", "John Doe"));
System.out.println(Application.init("MyApp", "1.0", "John Doe", "Windows"));
System.out.println(Application.init("MyApp", "1.0", "John Doe", "Windows", true));
System.out.println(Application.init("MyApp", "1.0", "John Doe", "Windows", true, 100));
System.out.println(Application.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity"));
System.out.println(Application.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity", true));
System.out.println(Application.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity", true, "(link unavailable)"));
System.out.println(Application.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity", true, "(link unavailable)", 5));
}
}