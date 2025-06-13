// -------------------
// Problem: 162. Find Peak Element
// Topic: Array, Binary Search
// Link: https://leetcode.com/problems/find-peak-element/description/
// Time complexity: O(log n)
// -------------------

class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else{ //(nums[mid]>nums[mid-1])
                start = mid+1;
            }
        }
        return start;
    }
}

  /*intutition behind approach: 1. Identify which side of array is mid
                                2. There are 2 side Ascending & Descending
                                3. if(arr[m] > arr[m+1]) then we can say we are on descending side of array
                                4. so update end as we need peak element which will lie between new end, i.e. e=m and s
                                ~curated by mithhhilesh 
                                */
