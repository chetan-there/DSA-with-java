// Q3: Rotate an Array by K Positions 
// Intuition: Reverse full array → reverse first k → reverse remaining n-k
package Arrays;

public class RotateArray {

    // Helper function to reverse array from index 'start' to 'end'
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array to the RIGHT by k positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n; // handle k > n
        if (k == 0) return;

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse last n-k elements
        reverse(arr, k, n - 1);
    }

    // Test Code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}