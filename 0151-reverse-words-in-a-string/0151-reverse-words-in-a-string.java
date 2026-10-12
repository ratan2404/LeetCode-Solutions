class Solution {
    public String reverseWords(String s) {
        String rev = "";
        s = s.trim();
        String[] ans = s.split("\\s+");
        for(int i = ans.length - 1; i >= 0; i--){
            rev = rev + ans[i] + " ";

        }
        return rev.trim();

    }
}