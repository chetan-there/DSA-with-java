package Arrays;
public class UnionOfArrays {

    // Function to find union of two arrays
    public static int[] union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of arr1
        for (int num : arr1) set.add(num);

        // Add all elements of arr2
        for (int num : arr2) set.add(num);

        // Convert set to array
        int[] ans = new int[set.size()];
        int i = 0;
        for (int num : set) ans[i++] = num;

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        int[] res = union(a, b);

        System.out.print("Union: ");
        for (int x : res) System.out.print(x + " ");
    }
}
