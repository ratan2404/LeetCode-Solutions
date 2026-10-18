class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int left = 0;
        int right = ans.length - 1;
        String vowels = "aeiouAEIOU";
        while(left < right){
            if(vowels.indexOf(ans[left]) == -1){
                left++;
            }
            else if(vowels.indexOf(ans[right]) == -1){
                right--;
            }
            else{
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;
                left++;
                right--;
            }

        }
        return new String(ans);

        
    }
}