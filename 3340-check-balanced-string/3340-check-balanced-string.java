class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            // Character digit ko int me convert karein
            int digit = num.charAt(i) - '0';

            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        // Dono sum equal hain toh true, warna false
        return evenSum == oddSum;
    }
}
