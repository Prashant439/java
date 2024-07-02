public class MetroDetails {
    public static void displayTicketPrice(String from, String to) {
        if (from == "Bhanashankari" && to == "BTM") {
            System.out.println("Ticket Price: Rs. 25");
        } else {
            System.out.println("Ticket Price: Rs. 50");
        }
    }
	    public static void checkCardBalance(int cardBalance, int ticketPrice) {
        if (cardBalance >= ticketPrice) {
            int updatedBalance = cardBalance - ticketPrice;
            System.out.println("Transaction successful!");
            System.out.println("Updated Card Balance: Rs. " + updatedBalance);
        } else {
            System.out.println("Insufficient balance!");
            System.out.println("Card Balance: Rs. " + cardBalance);
        }
    }
}



