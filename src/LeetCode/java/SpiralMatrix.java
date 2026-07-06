package LeetCode.java;
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowstart = 0;
        int colstart = 0;
        int rowend = matrix.length - 1;
        int colend = matrix[0].length- 1;
        while(colstart <= colend && rowstart <= rowend){
        //l to r
        for(int i = colstart; i <= colend; i++){
            res.add(matrix[rowstart][i]);
        }
        rowstart++;
        //top to bottom
        for(int i = rowstart; i <= rowend; i++){
            res.add(matrix[i][colend]);
        }
        colend--;
        //r to l
        if(rowstart <= rowend){
            for (int i = colend; i>= colstart; i--){
                res.add(matrix[rowend][i]);
            }
            rowend--;
        }
        //bottom to top
        if(colstart <= colend){
        for(int i = rowend; i >= rowstart; i--){
            res.add(matrix[i][colstart]);
        }
        colstart++;
        }
    }
    return res;
    }
}