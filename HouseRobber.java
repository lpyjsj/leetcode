public class Solution {
    public int rob(int[] num) {
      int length=num.length;
      if (length==0)
           return 0;
      else if (length==1)
             return num[0];
       else if(length==2)
          return Math.max(num[0],num[1]);
      else 
      {
          int f1=num[0];
          int f2=Math.max(num[0],num[1]);
          int i=2,f3=0;
          while(i<length)
          {
              f3=Math.max(num[i]+f1,f2);
              f1=f2;
              f2=f3;
              i++;
          }
          return f3;
      }
          
      }
      
      
    }
    
   
