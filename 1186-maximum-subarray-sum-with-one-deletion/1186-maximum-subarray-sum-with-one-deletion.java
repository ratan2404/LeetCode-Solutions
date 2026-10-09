class Solution {
    public int maximumSum(int[] arr) {
        int bestnodelete = arr[0];
        int bestdeleteone = 0;
        int res = arr[0];
        int nodelete = arr[0];
        int onedelete = 0;
        for(int i = 1; i < arr.length; i++){
            int purananodelete = nodelete;
            int puranaonedelete = onedelete;
            nodelete = Math.max(purananodelete + arr[i], arr[i]);
            onedelete = Math.max(puranaonedelete + arr[i], purananodelete);
            res = Math.max(res, Math.max(nodelete, onedelete));
        }
        return res;
    }
}