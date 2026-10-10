class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // case1- agar bich me max subarray aaye to simple sa maxsubarray nikal dege case2- agar dono side side max subarray aa raha eska matlab bich me to min subarray hi hoga to min subarray nikal lenge . aur fir sum of array me se ghata ke max answer nikal lenge fir return kar denge max maxsubarray aur jo ghatane per jo mila us dono ko...last ak extra case agar jo max subarray ki value 0 se km aa rahi to simple sa vahi maxsubarray ki value return kara denge.
        int bestendingMax = nums[0];
        int ansMax = nums[0];
        int bestendingMin = nums[0];
        int ansMin = nums[0];
        int sum = 0;
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
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(ansMax < 0){
            return ansMax;
        }
        int finalmax = sum - ansMin;
        return Math.max(finalmax, ansMax);
    }
}