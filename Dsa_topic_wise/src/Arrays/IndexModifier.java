package Arrays;

public class IndexModifier {
	// Method to update array values
	static void modifyArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] += 10; // Even index: add 10
			} else {
				arr[i] *= 2; // Odd index: multiply by 2
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 5, 3, 8, 6, 2, 9 };

		System.out.println("Before modification:");
		for (int num : data) {
			System.out.print(num + " ");
		}

		modifyArray(data); // Apply changes

		System.out.println("\nAfter modification:");
		for (int num : data) {
			System.out.print(num + " ");
		}
	}
}