// -------------------
// Problem: 1431. Kids With the Greatest Number of Candies
// Topic: Array
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
// Time complexity: 
// -------------------

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
