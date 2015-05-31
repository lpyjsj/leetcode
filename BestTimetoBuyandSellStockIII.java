public class Solution {
    public int maxProfit(int[] prices) {
        int length=prices.length;
        if(length<=1)
                 return 0;
      
  
       int [] f=new int[length];
       int [] g=new int[length];
        f[0]=0;
        f[1]=Math.max(0,prices[1]-prices[0]);
        
        int min=prices[0];
        
        for(int i=1;i<length;i++)
          {  
             min=Math.min(min,prices[i]);
             f[i]=Math.max(f[i-1],prices[i]-min);
            
          }
          
       int max=prices[length-1];
        g[length-1]=0;
        for(int j=length-2;j>=0;j--)
        {
           max=Math.max(max,prices[j]);
           g[j]=Math.max(g[j+1],max-prices[j]);
        }
       
       int maxprofit=0;
       for(int i=0;i<length;i++)
        maxprofit=Math.max(maxprofit,f[i]+g[i]);
       return maxprofit;
    }
 
        
    
}
