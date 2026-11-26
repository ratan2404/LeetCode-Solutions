class Solution {
    public boolean canAliceWin(int n) {
        int stonesToRemove = 10;
        int turns = 0;
        
        while (n >= stonesToRemove && stonesToRemove > 0) {
            n -= stonesToRemove;
            stonesToRemove--;
            turns++;
        }
        
        // Alice goes first, so she wins if an odd number of turns are completed
        return turns % 2 == 1;
    }
}
