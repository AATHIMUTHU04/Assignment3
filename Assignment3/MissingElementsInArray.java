package Assignment3;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,6,7,8};
		int arrlen=arr.length;
		System.out.println("arrlen");
		
		for (int i = 1; i < arr.length; i++) {
			
			int arrl=i+1;
			{
				if(arrl!=arr[i])
				{
					System.out.println(arrl);
					break;
				}
			}
			
		}	
	}				
}

	

	


