class Solution {
    public int minMoves(int[] nums) {
        // स्टेप 1: सबसे बड़ा एलिमेंट (Maximum Element) ढूंढें
        int maxVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }
        
        // स्टेप 2: बाकी बचे एलिमेंट्स को सबसे बड़े में से घटाकर स्टोर (Sum) करते जाएं
        int totalMoves = 0;
        for (int i = 0; i < nums.length; i++) {
            totalMoves += (maxVal - nums[i]);
        }
        
        // स्टेप 3: वेरिएबल को रिटर्न (या प्रिंट) कर दें
        return totalMoves;
    }
}
