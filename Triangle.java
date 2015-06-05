/*Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).*/


public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height=triangle.size();
        List<Integer> up=new ArrayList<Integer>();
        up.add(triangle.get(0).get(0));
        for(int i=1;i<height;i++)
        {
          List<Integer> down=new ArrayList<Integer>();
          for(int j=0;j<=i;j++)
          {
            int member=triangle.get(i).get(j);  
            if(j==0) 
               down.add(up.get(0)+member);
            else if(j==i)
               down.add(up.get(j-1)+member);
            else
              down.add(Math.min(up.get(j-1),up.get(j))+member);
          }
          up=down;
        }
        
        return Collections.min(up);
    }
}