
package Arrays;

import java.util.*;

public class RearrangePosNeg {
    public void rearrange(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Step 1: separate numbers
        for (int num : nums) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, p = 0, n = 0;

        // Step 2: fill alternating positive and negative
        // start with positive (standard interview expectation)
        while (p < pos.size() && n < neg.size()) {
            nums[i++] = pos.get(p++);
            nums[i++] = neg.get(n++);
        }

        // add remaining positives
        while (p < pos.size()) nums[i++] = pos.get(p++);

        // add remaining negatives
        while (n < neg.size()) nums[i++] = neg.get(n++);
    }

    public static void main(String[] args) {
        RearrangePosNeg r = new RearrangePosNeg();
        int[] arr = {1, -2, 3, -4, -1, 4};
        r.rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
