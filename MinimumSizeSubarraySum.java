public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int length=nums.length;
        int minlength=Integer.MAX_VALUE,sublength=0;
        int sum=0;
        for(int i=0;i<length;)
        {
          while(sum<s&&i<length)
             { 
               sum+=nums[i++];
               sublength++;
             }
        
           
             while(sum>=s)
              {
                minlength=Math.min(minlength,sublength);  
                sum-=nums[i-sublength];  
                sublength--;
                
              }
             

              
        }
        
        return minlength<Integer.MAX_VALUE?minlength:0;
    }
}