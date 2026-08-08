class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int index = 0;
        int n = s.length();
        int sign = 1;
        int total = 0;

        // 1. Remove leading whitespaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // 2. Check for optional sign
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        // 3. Convert digits and handle overflow
        while (index < n) {
            int digit = s.charAt(index) - '0';
            
            // Break at the first non-digit character
            if (digit < 0 || digit > 9) {
                break;
            }

            // Check overflow before updating total
            if (total > Integer.MAX_VALUE / 10 || 
               (total == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }
}
