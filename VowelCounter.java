public class VowelCounter {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "Java", "Xworkz", "prashant"};
        int vowelCount =0;
		
        for (String str : stringArray) {
            str = str.toLowerCase();

            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
        }

        System.out.println("Total number of vowels: " +vowelCount);
    }
}