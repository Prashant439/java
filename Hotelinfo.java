public class Hotelinfo {
  public static void checkIn()  {
  int Time = 10;
    if (Time == 10) {
      System.out.println("Welcome! Your room is ready.");
    } else if (Time == 1) {
      System.out.println("Great! We have a room available for you.");
    } else if (Time == 4) {
      System.out.println("We'll upgrade your room for free!");
    } else if (Time == 9) {
      System.out.println("We'll make sure to accommodate your special request.");
    } else {
      System.out.println("Sorry, we're fully booked. Try another hotel.");
    }
  }

  public static void review() {
   int review=3;
   System.out.println("Reciew:");
    if (review==1) {
      System.out.println("Excellent");
    } else if (review==2) {
      System.out.println("Very Good");
    } else if (review==3) {
      System.out.println("Good");
    } else if (review==4) {
      System.out.println("Average");
    } else if (review==5){
      System.out.println("Bad");
    }
  }

  public static void checkOut() {
   int Stay_days=2;
    if (Stay_days==2) {
      System.out.println("Please pay your outstanding balance.7000 RS");
    } else if (Stay_days==3) {
      System.out.println("Please pay your outstanding balance.10000 RS");
    } else if (Stay_days==4) {
      System.out.println("Please pay your outstanding balance.13000 RS");
    } else if (Stay_days==5) {
      System.out.println("Please pay your outstanding balance.15000 RS");
    } else if (Stay_days==6){
      System.out.println("Please pay your outstanding balance.20000 RS");
    }
  }
}
