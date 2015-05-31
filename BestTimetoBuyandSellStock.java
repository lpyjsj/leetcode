public class Solution {
    public int maxProfit(int[] prices) {
    
      int length=prices.length;
      if(length<=1) 
             return 0;
      int f1=Math.max(0,prices[1]-prices[0]); 
      int f2=0;
      int i=2;
      while(i<length)
       { f2=Math.max(f1,prices[i]-Min(prices,i-1));
         f1=f2;
         i++;
       }
     
      return f2;    
    }
    public int Min(int[] prices,int i)
    { 
      int min=prices[0];
      for(int j=0;j<=i;j++)
       if(prices[j]<min)
           min=prices[j];
      return min;       
        
    }
}
