// Q2: Find the Second Largest Element in an Array

package Arrays;

public class SecondLargestElement {

    public static Integer findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            // Update largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            // Update second largest (exclude equal to largest)
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // If secondLargest was never updated → no valid second largest
        if (secondLargest == Integer.MIN_VALUE) {
            return null; // all elements may be equal
        }

        return secondLargest;
    }

    // Test
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3, 20};
        Integer ans = findSecondLargest(arr);

        if (ans == null) System.out.println("No second largest element exists");
        else System.out.println("Second Largest: " + ans);
    }
}