// -------------------
// Problem: 1929. Concatenation of Array
// Topic: Array, Simulation
// Link: https://leetcode.com/problems/concatenation-of-array
// Time complexity: 
// -------------------

class Solution {
    public int[] getConcatenation(int[] nums) {
        int len =nums.length;
        int []ans = new int[2*len];
        for(int i=0; i<len; i++){

            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
        
    }
}
