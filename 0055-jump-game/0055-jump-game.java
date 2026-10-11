class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){     // Last se ek pehle wale index se shuru karke peeche (backward) ki taraf chalenge. last ko esliye nahi liye kyuki vahi goal hai.

            if(i + nums[i] >= goal){  //// Agar hum is index se goal tak ya usse aage tak jump kar sakte hain
                goal = i;  //Toh ab hamara naya goal yeh index ban jayega
            }
        }
        return goal == 0;//// Agar hamara goal shift hote-hote pehle index (0) par pahunch gaya, toh return true
    }
}