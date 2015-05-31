public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else if(x==0) return true;
        else
        {
          int xx=x;
          int y=0;
          while(x!=0)
          {
            y=10*y+x%10;
            x=x/10;
          }
          return xx==y? true:false;
        }
    }
}
