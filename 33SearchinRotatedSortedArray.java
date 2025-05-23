// -------------------
// Problem: 33. Search in Rotated Sorted Array
// Topic: Array, Binary Search 
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// Time complexity: 
// TAG: inefficient solution 
// -------------------

class Solution {
    public int search(int[] nums, int target) {
        int s = 0; 
        int e = nums.length-1;
        return BS(nums, target, s, e);
        
    }
    public int BS(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(nums[m] == target){
            return m;
        }
        if(nums[s]<= nums[m]){
            if(target >= nums[s] && target <= nums[m]){
                return BS(nums, target, s, m-1);
            }else{
                return BS(nums, target, m+1, e);
            }
        }
        if(target>= nums[m] && target <= nums[e]){
            return BS(nums, target, m+1, e);
        }
        if(target>= nums[m] && target >= nums[s]){
            return BS(nums, target, s, m-1);
        }
        if(target<= nums[m] && target <= nums[s]){
            return BS(nums, target, s, m-1);
        }
        return -1;
    }
}
