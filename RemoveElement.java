public class Solution {
    public int removeElement(int[] nums, int val) {
      if(nums.length<=0)
           return 0;
      int length=nums.length; 
      if(length==1)
       return nums[0]==val?0:1;
       
      int i=0,j=length-1;
      while(i<=j)
      {
        if( nums[i]!=val )
        i++;
        else if( nums[j]==val) 
        j--;
    
        else 
        {
        int temp=nums[i];
        nums[i++]=nums[j];
        nums[j--]=temp;
        }
      }
      //if(i==0) return 0;
      return i; 
        
    }
}