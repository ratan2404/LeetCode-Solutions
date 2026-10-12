class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(n % (i + 1) == 0){    //// nums[i+1] nahi likhna kyuki value se nahi, 1-based index (i+1) se divide check karna hai.
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
}