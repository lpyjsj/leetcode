/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

*/

public class Solution {
    public int reverse(int x) {
        boolean positive=x>0?true:false;
        long result=0;
        long xx=Math.abs((long)x);//注意这样写错误  xx=(long)Math.abs(x)
        while(xx!=0)
        { 
          result*=10;
          result+=xx%10;
          xx=xx/10;
        }
        
        if(result>Integer.MAX_VALUE)
         return 0;
        result= positive==true?result:-result;
        return (int)result;
        
    }
}