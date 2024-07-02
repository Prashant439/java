public class BankAccount{
    public static String accountHolderName="Prashant";
	public static double interest=0.7;
	public static long accountNumber=7876546574254l;
	
    
    public static void getAccountHolderNameVerify(String name){
	if (name=="Prashant"){
	 System.out.println("Account holder "+name+ " is verified");
	}
	else{
	    System.out.println("Please enter a valid name");
	}
	}
	
	public static void getAccountNumberVerify(long accountNum){
	if (accountNum==7876546574254l)
	 System.out.println("Account Number "+accountNum+ " is verified");
	else
	    System.out.println("Please enter correct Account No.");
	}
	
	public static void getBalence(double initialBalance) {
    Double totalbalance = initialBalance+(0.7*initialBalance);
	System.out.println("Account Holder is: "+accountHolderName);
	System.out.println("Total Balence is"+totalbalance);
  }
    
    public static void depositAmountBal(double depAmount, double balence){
	System.out.println("Deposit Amount is: "+depAmount);
	double final_Bal=depAmount+balence;
	System.out.println("Total Amount Balence in Account after Deposit is: "+final_Bal);
	}
    public static void withdrawAmount(double withAmount, double amt){
		System.out.println("Amount in Account before withdrawal is: "+amt);
		double bal=amt-withAmount;
		System.out.println("Amount left in Account after Withdrawal is: "+bal);
	}
}