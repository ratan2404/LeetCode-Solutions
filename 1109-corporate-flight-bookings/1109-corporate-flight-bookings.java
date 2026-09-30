class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for(int[] b : bookings){
            int first = b[0] - 1;
            int last = b[1];
            int seats = b[2];
            res[first] += seats;
            if(last < n){
                res[last] -= seats;
            }
        }
        for(int i = 1; i < n; i++){
            res[i] += res[i - 1];
        }
        return res;

    }
}