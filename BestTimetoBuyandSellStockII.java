public class Solution {
    public int maxProfit(int[] prices) {
     int length=prices.length; 
     if(length<=1) 
          return 0;
     
     int profit =0;
     for(int i=0;i<length;)
     {
       int j;
       for(j=i;j+1<length;)
         {
             if(prices[j]>prices[j+1] ||j+1>=length)
               break;
              
             if(prices[j]<=prices[j+1]) j++;
         }
         profit+=prices[j]-prices[i];
         i=j+1;
     }
     
     return profit;
     
    }

}
