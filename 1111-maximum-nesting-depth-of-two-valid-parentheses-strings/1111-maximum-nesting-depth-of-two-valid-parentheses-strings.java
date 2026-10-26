class Solution {
    public int[] maxDepthAfterSplit(String seq) {
       int[] res = new int[seq.length()];
       int curr = 0;
       for(int i = 0; i < seq.length(); i++){
            if(seq.charAt(i) == '('){
                curr++;
                res[i] = curr % 2;
            }
            else{
                res[i] = curr % 2;
                curr--;
            }
        } 
        return res;
    }
}