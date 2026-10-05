class Solution {
    public int findMaxLength(int[] nums) {
        // ham ye question Hashmap aur prefixsum ke help se solve kar rahe hai aur hame prefix sum ki jarurat esliye padi kyuki Hume pata chal sake ki kisi subarray me 0 aur 1 ki count equal hai ya nahi aur agar do baar same sum aa jaye eska matlab dono equal hai.
        HashMap<Integer, Integer> ans = new HashMap<>();
        // shuru me to sum zero hi hota hai aur uska index -1 maan liye hai
        ans.put(0, -1);
        int maxlen = 0;
        int count = 0;  //// Running sum track karne ke liye

        // ham 0 ko -1 bna rahe aur 1 ko +1 .
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count += -1;
            }
            else{
                count += 1;
            }
            if(ans.containsKey(count)){      // agr sum mila.eska matlab, Max length ko update karo: current index - purana index
                maxlen = Math.max(maxlen, i - ans.get(count));
            }
            else{
                ans.put(count, i);   //Agar sum naya hai, to ise HashMap me dal do
            }
        }
        return maxlen;
    }
}