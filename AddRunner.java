 public class AddRunner{
    public static void main(String args[]){
        System.out.println("First number: " +Add.num1);
        System.out.println("Second number: " +Add.num2);
        System.out.println("Sum: " +Add.sum);
        
        if (Add.sum == Add.num1) {
            System.out.println("The sum is equal to the first number.");
        } else {
            System.out.println("The sum is not equal to the first number.");
        }
    }	
}