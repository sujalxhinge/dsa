import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum candies
        int max = Arrays.stream(candies).max().getAsInt();
        // Initialize the result list
        List<Boolean> list = new ArrayList<>();

        // Check each kid's candies
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}

class extracandy {
    public static void main(String[] args) {
        int[] candies = {2, 5, 6, 4, 5};
        int extraCandies = 5;

        Solution solution = new Solution();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        // Print the result
        System.out.println(result);
    }
}
