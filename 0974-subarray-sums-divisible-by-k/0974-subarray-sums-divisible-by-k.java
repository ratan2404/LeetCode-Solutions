class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefixsum = 0;
        int left = 0;
        int[] freq = new int[k];
        freq[0] = 1;
        for(int i = 0; i < nums.length; i++){
            prefixsum += nums[i];
            int rem = prefixsum % k;
            if(rem < 0){
                rem += k;
            }
            count += freq[rem];
            freq[rem]++;
        }
        return count;
    }
}