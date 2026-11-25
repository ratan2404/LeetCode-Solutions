class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        while (i < s.length() && j < t.length()) {
            // If characters match, move to the next character in s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move forward in t
            j++;
        }

        // If i reached the end of s, all characters were found in order
        return i == s.length();
    }
}
