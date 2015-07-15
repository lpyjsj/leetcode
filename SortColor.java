/* 
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively. 
*/

public class Solution {
    public void sortColors(int[] nums) {
        int length=nums.length;
        if(length<=1)
          return ;
        int i=-1,j=0;  
        for(;j<length;j++)
        {
            if(nums[j]==0)
            {
                i++;
                nums[j]=nums[i];
                nums[i]=0;
            }
        }
        for(j=i+1;j<length;j++)
        {
            if(nums[j]==1)
            {
                i++;
                nums[j]=nums[i];
                nums[i]=1;
            }
        }
        
    }
}