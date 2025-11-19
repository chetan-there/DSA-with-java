package Arrays;

public class ArrayProduct {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1 };
		int product = 1;

		for (int num : arr) {
			product *= num;
		}

		System.out.println("Product of array elements: " + product);
	}
}