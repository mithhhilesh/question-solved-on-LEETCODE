// -------------------
// Problem: 832. Flipping an Image
// Topic: Array, Two Pointers, Bit Manipulation, Matrix, Simulation
// Link: https://leetcode.com/problems/flipping-an-image/description/
// Time complexity: 
// -------------------

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            for(int j=0; j<(image[0].length+1)/2; j++){
                int temp = image[i][j]^1;
                image[i][j]=image[i][image[0].length-j-1] ^ 1;
                image[i][image[0].length-j-1]=temp;
            }
        }
        return image;
    }
}
