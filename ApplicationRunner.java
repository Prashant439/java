public class ApplicationRunner{
 public static void main(String[] args) {
   String developerName = "John Doe";
        int supportedDevicesCount=5;
        double userRating=4.8;
        boolean isActive=true;
        String releaseDate="2022-01-01";
        char platform='C';
       long fileSize=102400L; 
       float discount=10.5f; 
       byte subscriptionMonths=12;

      System.out.println("App Name: " + Application.appName);
      System.out.println("Version: " + Application.version);
      System.out.println("Price: $" + Application.price);
      System.out.println("Is Licensed: " + Application.isLicensed);
     System.out.println("UserType: " + Application.UserType);
	 System.out.println("category: " + Application.category);
	 System.out.println("downloadsCount: " + Application.downloadsCount );
	 System.out.println("rating: " + Application.rating);
	 System.out.println("securityLevel: " + Application.securityLevel);

     
     System.out.println("Developer Name: "+developerName);
	 System.out.println("supportedDevicesCount: "+supportedDevicesCount);
	 System.out.println("userRating: "+userRating);
	 System.out.println("isActive: "+isActive);
	 System.out.println("releaseDate: "+releaseDate);
	 System.out.println("platform: "+platform);
	 System.out.println("fileSize: "+fileSize);
	 System.out.println("subscriptionMonths: "+subscriptionMonths);



   }
      
   }