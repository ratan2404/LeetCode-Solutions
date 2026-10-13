class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //ak hashset banaye hai ki nums1 ko store kare.
        HashSet<Integer> set = new HashSet<>();
        // dusara hashset ans ko store karne ke liye bnaye hai dono ke common ke store karerga nums1, nums2.
        HashSet<Integer> ans = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                ans.add(num);
            }
            
        }
        //integer array me esliye kiye kyuki question me bola hai array me return karo
        int[] res = new int[ans.size()];
        int i = 0;
        for(int num : ans){
            res[i] = num;
            i++;
        }
        return res;

    }
}