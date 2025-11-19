package Arrays;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr = { 12, 10, 2, 3, 5, -15, 0 };
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		System.out.println("Sum of array elements: " + sum);
	}
}