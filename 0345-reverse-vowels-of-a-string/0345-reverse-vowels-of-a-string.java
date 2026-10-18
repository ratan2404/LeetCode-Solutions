class Solution {
    public String reverseVowels(String s) {
        // ye two pinter se huaa hai  
        char[] ans = s.toCharArray();
        int left = 0;
        int right = ans.length - 1;
        //Vowels ko check karne ke liye ek helper string ya method ka use karenge
        String vowels = "aeiouAEIOU";
        while(left < right){
            // Agar left pointer par vowel nahi hai, to aage badho.
            if(vowels.indexOf(ans[left]) == -1){
                left++;
            }
            // Agar left pointer par vowel nahi hai, to aage badho
            else if(vowels.indexOf(ans[right]) == -1){
                right--;
            }
             // Agar DONO taraf vowel mil gaya, to swap karo aur pointers ko move karo
            else{
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;
                left++;
                right--;
            }

        }
         //Character array ko wapas string me badal kar return kiya
        return new String(ans);

        
    }
}