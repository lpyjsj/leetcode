 /*Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array may contain duplicates.
   */

public class Solution {
   
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1; 
        while(i<j)
          {
            int mid=(i+j)/2;
            if(nums[mid]>nums[j])
             i=mid+1;
            else if(nums[mid]<nums[j])
            j=mid;
            if(nums[mid]==nums[j] || nums[mid]==nums[i])
             return  findMinNum(nums);
            }
        
        return nums[i];
    }
    
    public int findMinNum(int[] nums)
    {
       int min=nums[0];
       for(int i=1;i<nums.length;i++)
        {
          if(min>nums[i]) 
           min=nums[i];
        }
       return min;
    }
}
