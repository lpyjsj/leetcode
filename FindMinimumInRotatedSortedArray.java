/*Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/
public class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1; 
        while(i<j)
          {
            int mid=(i+j)/2;
            if(nums[mid]>nums[j])
             i=mid+1;
            else
            j=mid;

            }
        return nums[i];
    }
}
