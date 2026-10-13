class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        if(n <= 0){
            return n;
        }
        while(n >= 1){
            n = n / 5;// 5 ke multiple se hi 0 aata hai esliye 5 liye hai
            count = count + n;
        }
        return count;
    }
}