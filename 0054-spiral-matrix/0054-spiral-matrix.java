import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> ans = new ArrayList<>(); 
      int n =matrix.length, m = matrix[0].length;
      int firstrow = 0, lastrow = n-1, firstcol = 0, lastcol = m-1;
      int tne = m*n;
      while(ans.size() < tne){
        for(int j=firstcol;j<=lastcol;j++){
            ans.add(matrix[firstrow][j]);
        }
        firstrow++;
        if(ans.size() == tne) break;
        for(int i=firstrow;i<=lastrow;i++){
            ans.add(matrix[i][lastcol]);
        }
        lastcol--;
        if(ans.size() == tne) break;
        for(int j=lastcol;j>=firstcol;j--){
            ans.add(matrix[lastrow][j]);
        }
        lastrow--;
        if(ans.size() == tne) break;
        for(int i=lastrow;i>=firstrow;i--){
            ans.add(matrix[i][firstcol]);
        }
        firstcol++;
      }
      return ans;  
    }
}
