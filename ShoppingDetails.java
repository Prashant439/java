class ShoppingDetails{
 public static void ShoppingType(String Mode){
         System.out.println("Shopping Mode:"+Mode);
		 System.out.println(" ");
}


 public static void details(String item_name, String Mode){
         System.out.println("Item Name:"+item_name);
		 System.out.println("Shopping Mode:"+Mode);
		  System.out.println(" ");
}
 public static void TotalPrice(int Price, int GST){
         System.out.println("Shopping Bill:"+Price);
		 System.out.println("GST Applied:"+GST+"%");
		 int TotalPrice= Price + (Price * GST)/100;
		 System.out.println("Total Bill:"+TotalPrice);
		  System.out.println(" ");
 }
 
 public static void details( String Mode, String item_name, int Price, int GST){
         System.out.println("Shopping Mode:"+Mode);
		 System.out.println("Item Name:"+item_name);
		 System.out.println("Shopping Bill:"+Price);
		 System.out.println("GST Applied:"+GST+"%");
		 int TotalPrice= Price+ (Price * GST)/100;
		 System.out.println("Total Bill:"+TotalPrice);
		  System.out.println(" ");
 }
}
