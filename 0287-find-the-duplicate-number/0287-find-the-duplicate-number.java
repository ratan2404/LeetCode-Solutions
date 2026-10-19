class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> ans1 = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(ans.contains(nums[i])){
                ans1.add(nums[i]);
                return nums[i];
            }
            ans.add(nums[i]);
        }
        return -1;

    }
}