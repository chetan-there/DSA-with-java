// Q1: Find the Maximum and Minimum Element in an Array

package Arrays;

public class MaxMinInArray {

    public static class Result {
        int max;
        int min;
        Result(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }

    public static Result findMaxMin(int[] arr) {
        // Edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int max = arr[0];
        int min = arr[0];

        // Traverse array once
        for (int num : arr) {
            if (num > max) {
                max = num; // update max
            }
            if (num < min) {
                min = num; // update min
            }
        }

        return new Result(max, min);
    }

    // Test
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
        Result ans = findMaxMin(arr);
        System.out.println("Max: " + ans.max);
        System.out.println("Min: " + ans.min);
    }
}
