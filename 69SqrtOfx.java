// -------------------
// Problem: 69. Sqrt(x)
// Topic: Math, Binary Search
// Link: https://leetcode.com/problems/sqrtx/description/
// Time complexity: 
// -------------------

class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int mid = 0;
        int ans = 0;
        while (s <= e) {
            mid = s + (e - s) / 2;

            if ((long)mid * mid == x) {
                return mid;
            } else if ((long)mid * mid < x) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
