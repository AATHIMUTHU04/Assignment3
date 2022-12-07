package Assignment3;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		int[] arr= {25,26,27,28,29,30,31,25,30,28};
		int arrlength=arr.length;
		for (int i = 0; i < arr.length-1; i++) {
			int count=1;
			for (int j =i+1; j < arr.length-1; j++) {
				if (arr[i]==arr[j])
				{
				count=count+1;
				}
			}
				if (count>1);{
				System.out.println(arr[i]);
				
				
			}
			
		}

	}

}
