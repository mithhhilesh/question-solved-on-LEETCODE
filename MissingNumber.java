// -------------------
// Problem: 268. Missing Number
// Topic: Array, Binary Search
// Link: https://leetcode.com/problems/missing-number/description/
// Time complexity: 
// -------------------

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0; 
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                //swap(nums, i, correct);
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]= temp;
            }else{
                i++;
            }
        }
        for(int in = 0; in<nums.length; in++){
            if(nums[in] != in){
                return in;
            }
        } 
        return nums.length;
    }
    // void swap(int[] arr, int first, int second){
    //     int temp = arr[first];
    //     arr[first]=arr[second];
    //     arr[second]= temp;
    // }
    
}
