public class Solution {
    public int majorityElement(int[] nums) {
        int result=nums[0];
        int times=1;
        for(int i=1;i<nums.length;i++)
        { 
          if(times==0)
           {
            result=nums[i];
            times=1;
           }
         else if(result==nums[i])
          times++;
         else
           times--;
       }
       return result;    
    }
}
