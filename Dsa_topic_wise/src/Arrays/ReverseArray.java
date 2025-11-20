package Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse logic
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("\nReversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}