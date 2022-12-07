package Assignment3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,1,2,3};
		int len=arr.length;
		int temp[] =new int [arr.length];
		int j=0;
		for (int i = 0; i < len-1; i++) {
			if (arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				
			}
			
		}
		temp[j+1]=arr[len-1];
		for (int k = 0; k < j; k++) {
			System.out.println(temp[k]);
			
		}
		
		

	}

}
