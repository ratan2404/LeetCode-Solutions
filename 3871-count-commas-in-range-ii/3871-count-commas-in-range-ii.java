class Solution {
    public long countCommas(long n) {
        long curr = 1000;
        long res = 0;
        if(n < curr){
            return 0;
        }
        while(n >= curr){
            res += n - curr + 1;
            curr *= 1000; // kyuki agla comma 1000 ke baad das lakh pe aayega.
        }
        return res;
    }
}