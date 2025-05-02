package javapractices;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 40, 35, 39, 0, 2 };                      // [10,40,35,39,0,2]
		System.out.println("Ascending order array : ");          // Ascending order [0,2,10,35,39,40]
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int c = arr[i];

					arr[i] = arr[j];
					arr[j] = c;

				}
			}
			System.out.println(arr[i]);
		}

	}

}
