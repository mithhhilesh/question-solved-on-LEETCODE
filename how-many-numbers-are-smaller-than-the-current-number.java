// -------------------
// Problem: How many numbers are smaller than the current number
// Topic: Array, sorting
// Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
// Time complexity: 
// -------------------

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
