package Arrays;

public class MaxElement {
	public static void main(String[] args) {
		int[] arr = { 12, -7, 5, 14, 9, -15, 0 };
		int max = arr[0]; // Assume first element is max

		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}

		System.out.println("Maximum element in the array: " + max);
	}
}