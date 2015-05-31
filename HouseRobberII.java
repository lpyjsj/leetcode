public class Solution {
    public int rob(int[] nums) {
       int length=nums.length;
       if(length==0) return 0;
       else if(length==1) 
       return nums[0];
       else if(length==2)
       return Math.max(nums[0],nums[1]);
       else
       return Math.max(robMax(nums,0,length-2),robMax(nums,1,length-1));
           
        
    }
    
   int robMax(int[] num,int start,int end)
   {
      int length=end-start+1;
      if (length==0)
           return 0;
      else if (length==1)
             return num[start];
       else if(length==2)
          return Math.max(num[start],num[end]);
      else 
      {
          int f1=num[start];
          int f2=Math.max(num[start],num[start+1]);
          int i=2,f3=0;
          while(i<length)
          {
              f3=Math.max(num[i+start]+f1,f2);
              f1=f2;
              f2=f3;
              i++;
          }
          return f3;
      } 
   }
}
