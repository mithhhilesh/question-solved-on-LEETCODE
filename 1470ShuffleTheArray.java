// -------------------
// Problem: 1470
// Topic: Array
// Link: https://leetcode.com/problems/shuffle-the-array/description/
// Time complexity: O(N)
// -------------------

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0, j=0;
        int[] arr = new int[nums.length];

        if(i != n-1){
            while(i != n-1 && n != nums.length){
                arr[j] = nums[i];
                j++;
                arr[j] = nums[n];
                j++;
                i++;
                n++;
            }
            return arr;

        }else{
            return nums;
        }
    }
}
// APPROPRIATE APPROACH
// -------------------
// Problem: 1470
// Topic: Array
// Link: https://leetcode.com/problems/shuffle-the-array/description/
// Time complexity: O(N)
// -------------------

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j = 0;
        
        for(int i = 0; i < n; i++) {
            arr[j++] = nums[i];      
            arr[j++] = nums[i + n]; 
        }
        
        return arr;
    }
}



