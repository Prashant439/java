public class Hotel{
    public static String menuItems="Prashant";
	public static double itemsPrice=0.7;
	public static long TotalBill=7876546574254l;
    
    
	
    
    public static void getMenuItems(String name){
	if (name=="Prashant"){
	 System.out.println("MenuItems "+name+ " is verified");
	}
	else{
	    System.out.println("Please enter a valid Item");
	}
	}
	
	public static void getiteprice(long price){
	if (price==7876546574254l)
	 System.out.println("item price"+price+ " is verified");
	else
	    System.out.println("Price is wrong");
	}
	
	public static void getTotalbill(double initialbill) {
    Double totalbill = initiabill+(0.7*initiabill);
	System.out.println("Account Holder is: "+MenuItems);
	System.out.println("Total Balence is"+totalbill);
  }
    
   
}