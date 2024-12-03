import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<int[]> numIdenticalPairs(int[] nums) {
        List<int[]> goodPairs = new ArrayList<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if pairs of elements are equal
                if (nums[i] == nums[j]) {
                    goodPairs.add(new int[]{i, j}); // Store the pair of indices
                }
            }
        }
        return goodPairs;
    }
}

class goodpairs {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 3, 2, 1};
        List<int[]> result = s.numIdenticalPairs(nums);

        System.out.println("Identical pairs (index pairs):");
        for (int[] pair : result) {
            System.out.println("Pair: [" + pair[0] + ", " + pair[1] + "]"); // Print the indices of the pairs
        }
    }
}
