public class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
         k=k%length;
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,length-1);
        
    }
    public void reverse(int[] nums,int start,int end)
    {
        for(int i=start,j=end;i<j;i++,j--)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}