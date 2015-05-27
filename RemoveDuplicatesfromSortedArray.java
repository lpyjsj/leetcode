public class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length<=0)
             return 0;
        int count=0;
        int i=0,j=0;
        while(j<nums.length)
          {
            if(nums[i]==nums[j])
             j++;
           else
           { 
             nums[++count]=nums[j];
             i=j;
           }
          }
          return count+1;
    }
}