/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row
*/
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        if(row*col==0) return false;
        
        int i=0,j=row*col-1;
        while(i<=j)
        {
           int mid=(i+j)/2;
           int middleElement=matrix[mid/col][mid%col];
           if(middleElement==target)
            return  true;
          else if(middleElement<target)  
            i=mid+1;
          else
            j=mid-1;
        }
     return false;    
    }
}
