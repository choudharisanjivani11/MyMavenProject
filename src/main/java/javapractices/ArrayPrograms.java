package javapractices;

public class ArrayPrograms {

	public static void main(String[] args) {
		
		int arr[]= { 15,6,200,3,100,150,12 };    //print array 
		
			for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" ");
		
		//bubble sort
		//print array in ascending order {3,6,12,15,100,150,200}
		
		/*	System.out.println("Array in ascending order :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {     if(arr[i]>arr[j])
				                         int c=arr[i];
				                         arr[i]=arr[j]
				                         arr[j]=c;
					int C=arr[i];
					
					arr[i]=arr[j];
					arr[j]=C;
				}
				
			}
			System.out.println(arr[i]);
		} */
		
	 System.out.println(" ");
		//print array in descending order {200,150,100,15,12,6,3}
				System.out.println("Array in descending order :");
				
				for(int i=0; i<arr.length; i++) {
					for(int j=i+1; j<arr.length; j++) {
						
						if(arr[i]<arr[j]) {
							int C=arr[i];
							
							arr[i]=arr[j];
							arr[j]=C;
						}
					}
					System.out.println(arr[i]);
				} 
		/* System.out.println(" ");
				System.out.println("find min and max element in ascending order array :");
				System.out.println("min:" +arr[0]);
				System.out.println("max:" +arr[arr.length-1]);
				System.out.println(" ");
				System.out.println("find 2 min and 2 max element in ascending order array :");
				System.out.println("min:" +arr[1]);
				System.out.println("max:" +arr[arr.length-2]);  */
	System.out.println(" ");
				System.out.println("find min and max element in descending order array :");
				System.out.println("min:" +arr[0]);
				System.out.println("max:" +arr[arr.length-1]); 
				System.out.println(" ");
				System.out.println("find 2 min and 2 max element in descending order array :");
				System.out.println("min:" +arr[1]);
				System.out.println("max:" +arr[arr.length-2]);  
				
	}

}
