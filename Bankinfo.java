public class Bankinfo {
    public static void Branch() {
	 int id = 1;
        if (id ==1) {
            System.out.println("Rajaji nagar Branch. id is 1");
        } else if (id == 2) {
            System.out.println("hanuman nagar Branch. id is 2");
        } else if (id == 3) {
            System.out.println("BTM 2ND Stage Branch. id is 3");
        } else if (id == 4) {
            System.out.println("Gandi nagar Branch. id is 4 ");
        } else if (id == 5) {
            System.out.println("RR Nagar Branch. id is 5");
        }else{
		System.out.println("invalid id....!");
		}
    }
	
	    public static void Loan() {
	 int loanAmount= 10000;
        if (loanAmount == 10000) {
            System.out.println("loan Amount is " +loanAmount+" with 5% intrest");
        } else if (loanAmount == 20000) {
            System.out.println("loan Amount is "+loanAmount+" with 10% intrest");
        } else if (loanAmount== 30000) {
            System.out.println("loan Amount is "+loanAmount+ "with 15% intrest");
        } else if (loanAmount == 40000) {
            System.out.println("loan Amount is "+loanAmount+" with 20% intrest");
        } else if (loanAmount == 50000) {
            System.out.println("loan Amount is "+loanAmount+" with 25% intrest");
        }else{
		System.out.println("loan Amount is "+loanAmount+" with 25% intrest");
		}
    }
	
	    public static void FD_Return() {
	 int FD_amt = 100000;
        if (FD_amt == 100000) {
            System.out.println("For " +FD_amt+" you will get 5% return");
        } else if (FD_amt == 200000) {
            System.out.println("For "+FD_amt+ "you will get 7% return");
        } else if (FD_amt == 300000) {
            System.out.println("For "+FD_amt+ "you will get 10% return");
        } else if (FD_amt == 400000) {
            System.out.println("For "+FD_amt+" you will get 12% return");
        } else if (FD_amt == 500000) {
            System.out.println("For" +FD_amt+ "you will get 15% return");
        }else{
		System.out.println("For" +FD_amt+ "you will get 15% return");
		}
    }


}
