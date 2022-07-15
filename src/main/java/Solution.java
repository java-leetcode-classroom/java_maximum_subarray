public class Solution {
  public int maxSubArray(int[] nums) {
    int nLen = nums.length;
    int sum = nums[0];
    int maxSum = nums[0];
    for (int end = 1; end < nLen; end++) {
      // max sum include nums[end]
      sum = Math.max(sum + nums[end], nums[end]);
      // maxSum before end
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }
}
