
class Solution {
    public int arrayPairSum(int[] nums) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);
        
        int maxSum = 0;
        
        // Step 2: Iterate through the array, skipping by 2 to grab the min of each pair
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        return maxSum;
    }
}
