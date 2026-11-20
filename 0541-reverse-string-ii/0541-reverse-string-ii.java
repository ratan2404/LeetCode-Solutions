class Solution {
    public String reverseStr(String s, int k) {
        // String ko character array mein convert karein kyunki Java strings immutable hoti hain
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        // Har 2k steps par jump karein
        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            // Agar end mein k se kam characters bache hain, toh n - 1 tak hi jayein
            int right = Math.min(i + k - 1, n - 1);
            
            // Two-pointers se characters swap karke reverse karein
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
        
        // Character array ko wapas String mein convert karke return karein
        return new String(arr);
    }
}
