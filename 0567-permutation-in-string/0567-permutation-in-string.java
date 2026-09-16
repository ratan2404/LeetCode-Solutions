class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if(n > s2.length()){
            return false;

        }
        int [] s1Freq = new int[26];
        int [] windowFreq = new int[26];
        for(int i = 0; i < n; i++){
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }
        for(int right = n; right < s2.length(); right++){
            if(java.util.Arrays.equals(s1Freq, windowFreq)){
                return true;
            }
            windowFreq[s2.charAt(right) - 'a']++;
            windowFreq[s2.charAt(right - n) - 'a']--;

        }
        return java.util.Arrays.equals(s1Freq, windowFreq);
    }
}