// -------------------
// Problem: 852. Peak Index in a Mountain Array
// Topic: Array, Binary Search
// Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Time complexity: O(log n)
// -------------------

class Solution {
    public static int  peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length-1;
        while(s < e){
            int m = s + (e-s)/2;
            if(arr[m] > arr[m+1]){
                e = m;
            }else{
                s = m + 1;
            }
        }
        return s;
    }

  /*intutition behind approach: 1. Identify which side of array is mid
                                2. There are 2 side Ascending & Descending
                                3. if(arr[m] > arr[m+1]) then we can say we are on descending side of array
                                4. so update end as we need peak element which will lie between new end, i.e. e=m and s
                                ~curated by mithhhilesh 
                                */
