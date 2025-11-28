// Q4: Find the Intersection of Two Arrays

package Arrays;

import java.util.*;

public class IntersectionOfArrays {

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();  // store unique elements of arr1
        HashSet<Integer> result = new HashSet<>(); // to avoid duplicates in output

        // Add elements of first array
        for (int num : arr1) {
            set.add(num);
        }

        // Check intersection with second array
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Return as list
        return new ArrayList<>(result);
    }

    // Test Code
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        int[] b = {2, 2, 3, 6};

        List<Integer> ans = findIntersection(a, b);

        System.out.println("Intersection: " + ans);
    }
}
