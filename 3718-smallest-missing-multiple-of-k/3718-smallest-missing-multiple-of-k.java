class Solution {
    public int missingMultiple(int[] nums, int k) {
        // 1. Saare numbers ko HashSet me store karenge taaki O(1) me check kar sakein
        HashSet<Integer> ans = new HashSet<>();
        for(int num : nums){
            ans.add(num);
        }
        // 2. Loop chalayenge array ki length + 1 tak
        for(int i = 1; i <= nums.length + 1; i++){
            int multiply = k * i;
            // 3. Agar yeh multiple array (set) me nahi hai, toh yahi hamara answer hai
            if(!ans.contains(multiply)){
                return multiply;
            }
        }
        return -1;
    }
}