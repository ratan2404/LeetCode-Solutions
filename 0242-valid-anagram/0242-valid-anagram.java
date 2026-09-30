class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;

        }
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        java.util.Arrays.sort(schar);
        java.util.Arrays.sort(tchar);
        return java.util.Arrays.equals(schar, tchar);
    }
}