// -------------------
// Problem: 26. Remove Duplicates from Sorted Array
// Topic: Array, Two Pointer
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array
// Time complexity: 
// -------------------

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueCount = 1;
        int currentNum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentNum) {
                nums[uniqueCount] = nums[i];
                currentNum = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
