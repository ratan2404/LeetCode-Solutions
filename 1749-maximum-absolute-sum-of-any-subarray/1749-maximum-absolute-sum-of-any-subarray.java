class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //pahle maximum subarray nikal ke uske answer ko absolute karde phir minsubarray nikal ke uske answer ko absolute kar de fir dono ka max lele fir jo max jo bhi hoga usko return kara de.
        int bestendingMax = nums[0];
        int ansMax = nums[0];
        int bestendingMin = nums[0];
        int ansMin = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = bestendingMax + nums[i];
            int v2 = nums[i];
            bestendingMax = Math.max(v1, v2);
            ansMax = Math.max(ansMax, bestendingMax);


            int v3 = bestendingMin + nums[i];
            int v4 = nums[i];
            bestendingMin = Math.min(v3, v4);
            ansMin = Math.min(ansMin, bestendingMin);

        }
        int absMax = Math.abs(ansMax);
        int absMin = Math.abs(ansMin);

        return Math.max(absMax, absMin);
    }
}