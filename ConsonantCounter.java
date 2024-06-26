public class ConsonantCounter {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "Apple", "Xworkz", "Shashi"};
        int Consonant =0;
		
        for (String str : stringArray) {
            str = str.toLowerCase();

            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    Consonant = Consonant;
                }else if(c != ' '){
					Consonant++;
					
				}
            }
        }

        System.out.println("Total number of Consonant: " +Consonant);
    }
}