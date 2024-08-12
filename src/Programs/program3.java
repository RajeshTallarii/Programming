package Programs;

public class program3 {
	//{3,1,5,7,8,1,8,7,8,5} output 3,5,8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,5,7,8,1,8,7,8,5};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]);
				
			}
			
			
		}
		System.out.println();
		for(int j=0;j<arr.length;j=+3) {
			
			//System.out.println();
			for(int k=1;k<arr.length;k=k+j) {
				System.out.print(arr[j]);
				System.out.print(arr[k]);
				break;
				
			}
		}
		

	}

}
