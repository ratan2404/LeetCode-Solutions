class Solution {
    public long sumAndMultiply(int n) {
        long x = 0, sum = 0, place = 1;
        
        while (n > 0) {
            int digit = n % 10; // 1. Peeche se digit nikala
            if (digit != 0) {
                sum += digit;        // 2. Sum calculate kiya
                x += digit * place;  // 3. Bina string ke number banaya
                place *= 10;         // Place value (1, 10, 100...) badhayi
            }
            n /= 10; // Naya number chota kiya
        }
        
        return x * sum; // 4. Multiply karke return kiya
    }
}
