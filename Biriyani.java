public class Biriyani {

    public static void displayIngredients(String... ingredients) {
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
	  public static void displayReview(int rating) {
        if (rating == 10) {
            System.out.println("Rating: Wow");
        } else if (rating > 5 && rating < 10) {
            System.out.println("Rating: Good");
        } else if (rating < 5) {
            System.out.println("Rating: Worst");
        } else {
            System.out.println("Invalid rating");
        }
    }
public static void calculateTotalPrice(String quality, double price) {
        double totalPrice = 0;
        if (quality == "Premium") {
            totalPrice = price + (price * 0.2);
			System.out.println("Total bill: "+totalPrice);
        } else if (quality == "Standard") {
            totalPrice = price;
			System.out.println("Total bill"+totalPrice);
        } else if (quality == "Economic") {
            totalPrice = price - (price * 0.1); 
			System.out.println("Total bill"+totalPrice);
        } else {
            System.out.println("Invalid Quality");
        }
        
    }

}
