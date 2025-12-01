
package Arrays;

import java.util.HashMap;

public class PairSumCount {
    public int countPairs(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = target - num;

            // If complement exists, we found pairs
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // increase current number's frequency
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        PairSumCount p = new PairSumCount();
        int[] arr = {1, 5, 7, 1};
        System.out.println(p.countPairs(arr, 6));  // 2  (1,5) and (5,1)
    }
}
