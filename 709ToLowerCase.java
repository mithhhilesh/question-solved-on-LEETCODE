// -------------------
// Problem: 268. To Lower Case
// Topic: String
// Link: https://leetcode.com/problems/to-lower-case/description/
// Time complexity: 
// -------------------

class Solution {
    public static String toLowerCase(String s) {
        if(s.isEmpty()){
            return "";
        }
        StringBuilder a = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            a.append(Character.toLowerCase(ch));
        }
        return a.toString();
    }
}
