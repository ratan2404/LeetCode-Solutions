class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Start with the empty subset: []
        result.add(new ArrayList<>());
        
        // Process each number one by one
        for (int num : nums) {
            int size = result.size();
            
            // Copy existing subsets and add the current number to them
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        
        return result;
    }
}
