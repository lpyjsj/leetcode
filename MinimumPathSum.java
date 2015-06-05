/*Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right 
which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
*/

public class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] s=new int [m][n];
        for(int i=0;i<m;i++)
         for(int j=0;j<n;j++)
          {
            if(i==0)
             {
              if(j==0)
              s[i][j]=grid[i][j];
              else
              s[i][j]=s[i][j-1]+grid[i][j];
             }
             else 
              {
                  if(j==0)
                   s[i][0]=s[i-1][0]+grid[i][0];
                  else
                  s[i][j]=Math.min(s[i][j-1],s[i-1][j])+grid[i][j];
              }
             
          }
          
          return s[m-1][n-1];
    }
}