package Arrays;

public class Arraybasic {

	// =============================================
	// 1. DIFFERENT WAYS TO DECLARE ARRAYS (NO PREDEFINED METHODS)
	// =============================================
	public static void main(String[] args) {

        // 🔹 Way 1: Declare + Initialize later
        int[] arr1;                   // Step 1: Declare
        arr1 = new int[5];            // Step 2: Allocate memory

        // 🔹 Way 2: Declare + Allocate together
        int[] arr2 = new int[5];

        // 🔹 Way 3: Declare + Initialize with values
        int[] arr3 = {10, 20, 30, 40, 50};

        // 🔹 Way 4: Using 'new' keyword with values
        int[] arr4 = new int[]{5, 15, 25, 35};

        // 🔹 Way 5: 2D Array
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 🔹 Way 6: Jagged Array
        int[][] jagged = {
            {1, 2},
            {10, 20, 30}
        };


        // =============================================
        // 2. LOOPING IN ARRAYS
        // =============================================

        // ▶ Normal For Loop
        System.out.println("Normal For Loop:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Index " + i + " = " + arr3[i]);
        }

        // ▶ Enhanced For Loop
        System.out.println("Enhanced For Loop:");
        for (int num : arr3) {
            System.out.println(num);
        }

        // ▶ While Loop
        System.out.println("While Loop:");
        int i = 0;
        while (i < arr3.length) {
            System.out.println(arr3[i]);
            i++;
        }


        // =============================================
        // 3. ACCESSING ELEMENTS
        // =============================================
        System.out.println("First element: " + arr3[0]);
        System.out.println("Last element: " + arr3[arr3.length - 1]);

        arr3[1] = 200; // Updating value manually
        System.out.println("Updated index 1: " + arr3[1]);


        // =============================================
        // 4. IMPORTANT TRICKS (WITHOUT USING PREDEFINED METHODS)
        // =============================================

        int[] nums = {18, 99, 5, 62, 41, 7, 102};

        // ▶ Find Maximum
        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        System.out.println("Largest Number: " + max);

        // ▶ Find Minimum
        int min = nums[0];
        for (int n : nums) {
            if (n < min) min = n;
        }
        System.out.println("Smallest Number: " + min);


        // ▶ Manual Sorting (Ascending) – Bubble Sort
        for (int a = 0; a < nums.length - 1; a++) {
            for (int b = 0; b < nums.length - a - 1; b++) {
                if (nums[b] > nums[b + 1]) {
                    // swap
                    int temp = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array (Ascending):");
        for (int n : nums) System.out.print(n + " ");


        // ▶ Reverse Array Manually
        System.out.println("Reversed Array:");
        for (int j = nums.length - 1; j >= 0; j--) {
            System.out.print(nums[j] + " ");
        }


        // ▶ Linear Search (Manual Searching)
        int target = 62;
        boolean found = false;
        for (int n : nums) {
            if (n == target) {
                found = true;
                break;
            }
        }
        System.out.println("Is 62 present? " + found);


        // ▶ Sum of Array (Manual)
        int sum = 0;
        for (int n : nums) sum += n;
        System.out.println("Sum of values: " + sum);


        // ▶ Copy Array Manually
        int[] copyArr = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            copyArr[k] = nums[k];
        }

        System.out.println("Copied Array:");
        for (int n : copyArr) System.out.print(n + " ");


        // =============================================
        // END OF ARRAY BASICS (NO PREDEFINED METHODS USED)
        // =============================================
    }
}
