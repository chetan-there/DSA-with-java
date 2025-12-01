// Problem 7 - Majority Element (> n/2 times)
package Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;       // choose new candidate
            }
            count += (num == candidate) ? 1 : -1; 
        }

        // Phase 2: (Optional) Verify candidate if needed
        // Since question guarantees majority element, we skip check
        
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(m.majorityElement(arr));  // 2
    }
}
