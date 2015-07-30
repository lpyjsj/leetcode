/*Implement int sqrt(int x).

Compute and return the square root of x.
*/

public class Solution {
    public int mySqrt(int x) {
        if(x<=0) 
            return 0;
        int i=1,j=x,mid=0,ans=0;
        while(i<=j)
        {
          mid=(i+j)/2;
          if(x/mid>=mid)
          { 
              i=mid+1;
              ans=mid;
          }
          else 
               j=mid-1;
        }
        
        return ans;
    }
}
