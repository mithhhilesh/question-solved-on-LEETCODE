// -------------------
// Problem: 1732. Find the Highest Altitude
// Topic: Array, Prefix Sum
// Link: https://leetcode.com/problems/find-the-highest-altitude
// Time complexity: O(N)
// -------------------

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length + 1;
        int[] sum = new int[n];
        int alt = 0;
        for(int i = 0; i<n-1; i++){
            sum[i+1] = sum[i]+gain[i];
        }
        for(int i =0; i<n; i++){
            if(alt<sum[i]){
                alt = sum[i];
            }
        }
        return alt;
    }
}
