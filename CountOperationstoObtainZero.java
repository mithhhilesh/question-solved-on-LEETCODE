// -------------------
// Problem: 2169. Count Operations to Obtain Zero
// Topic: Math, Simulation
// Link: https://leetcode.com/problems/count-operations-to-obtain-zero/description/
// Time complexity: 
// -------------------

class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
        while(num1 !=0 && num2 !=0){
            if(num1>=num2){
                num1=num1-num2;
                count++;
            }else{
                num2=num2-num1;
                count++;
            }
        }
        return count;
    }
}
