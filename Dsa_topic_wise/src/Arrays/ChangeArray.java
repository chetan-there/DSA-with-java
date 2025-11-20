package Arrays;

public class ChangeArray {
	// Method that changes array values
	static void updateArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5; // Add 5 to each element
		}
	}

	public static void main(String[] args) {
		int[] data = {10, 20, 30, 40};

		System.out.println("Before update:");
		for (int num : data) {
			System.out.print(num + " ");
		}

		updateArray(data); // Pass array to method

		System.out.println("\nAfter update:");
		for (int num : data) {
			System.out.print(num + " ");
		}
	}
}