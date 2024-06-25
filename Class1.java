class Class1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3,};
		String[] strArray = {"dog", "cat", "bird"};
        long[] longArray = {400L, 500L, 600L};
        char[] charArray = {'x', 'y', 'z'};
        for (int element=0; element<array.length; element++) {
            System.out.println(array[element]);
			System.out.println(strArray[element]);
			System.out.println(longArray[element]);
			System.out.println(charArray[element]);
			
        }
    }
}



