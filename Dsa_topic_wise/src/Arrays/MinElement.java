package Arrays;

public class MinElement {
	public static void main(String[] args) {
		int[] arr = { 25, 47, 3, 19, 8, 18 }; // Sample array

		int min = arr[0]; // Assume first element is minimum
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Minimum element in the array: " + min);
	}
}
