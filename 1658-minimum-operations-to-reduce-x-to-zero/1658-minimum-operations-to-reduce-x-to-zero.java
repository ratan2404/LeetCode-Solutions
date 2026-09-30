class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0; 
        int left = 0;
        int maxlen = -1;
        int newsum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int target = sum - x;
        for(int i = left; i < nums.length; i++){
            newsum += nums[i];
            while(newsum > target && left <= i){
                newsum -= nums[left];
                left++;
            }
            if(newsum == target){
                maxlen = Math.max(maxlen, i - left + 1);
            }
        }
        return maxlen == -1 ? -1 : nums.length - maxlen;

    }
}