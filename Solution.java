import java.util.Arrays;

class InitiateArr  {
  public int[] runningSum(int[] nums) {
      // Start from index 1 to avoid accessing out-of-bounds index
      for (int i = 1; i < nums.length; i++) {
          nums[i] = nums[i] + nums[i - 1];
      }
      return nums;
  }
}

class Solution{
  public static void main(String[] args) {
      InitiateArr s = new InitiateArr();
      int[] nums = {1, 2, 3, 4};

      // Call the method using the object
      int[] result = s.runningSum(nums);

      // Print the result
      for (int num : result) {
          System.out.print(num + " ");
      }
  }
}
