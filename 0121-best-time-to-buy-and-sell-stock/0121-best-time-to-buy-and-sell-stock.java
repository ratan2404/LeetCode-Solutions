class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int ans = 0;
        int count = 0;
        while(j < prices.length){
            if(prices[i] < prices[j]){
            ans = prices[j] - prices[i];
            count = Math.max(ans, count);
           }
           else{
            i = j; //जब नया दाम और भी सस्ता है, तो हम पुराने महंगे दाम को भूल जाते हैं और नए दिन को अपना खरीदने का दिन बना लेते हैं।
           }
           j++;
        }
        return count;
    }
}