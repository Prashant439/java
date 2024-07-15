public class ZeroAndOnes{
	
	public static void main(String args[]){
		
		int[] count = {0,1,0,0,1,0,1,0,1};
		int zeroCount =0;
		int oneCount =0;
		
		for(int index=0 ; index<count.length; index++){
			if(count[index]==1){
				oneCount+=1;
			}else{
				zeroCount+=1;
			}
		}
		System.out.println("The 1's count is: "+oneCount);
		System.out.println("The 0's count is: "+zeroCount);
	}

}