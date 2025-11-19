package Arrays;

public class NegativeElements {
	public static void main(String[] args) {
		int[] arr = { 12, -7, 5, -3, 9, -15, 0 };

		System.out.println("Negative elements in the array:");
		for (int num : arr) {
			if (num < 0) {
				System.out.println(num);
			}
		}
	}
}