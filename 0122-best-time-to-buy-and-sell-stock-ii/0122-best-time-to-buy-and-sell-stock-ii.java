class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int count = 0;
        while(j < prices.length){
            if(prices[i] < prices[j]){
                ans = prices[j] - prices[i];
                count += ans;
                i = j;//जैसे ही हमें किसी दिन मुनाफा मिलता है, हम उस दिन शेयर बेच देते हैं। शेयर बेचने के तुरंत बाद, अगला शेयर खरीदने के लिए हमारा पॉइंटर i भी उसी दिन (j) पर आ जाना चाहिए। यही काम i = j; करता है।

            }
            else{
                i = j;
            }
            j++;
        }
        return count;
    }
}