public class Solution {
    public int findKthLargest(int[] nums, int k) {
       int low=0,high=nums.length-1;
       int mid=-1;
       while(mid!=k-1)
       {
          mid=quickSort(nums,low,high); 
          if(mid>k-1)
            high=mid-1;
          else
            low=mid+1;
       }
       return nums[k-1];
        
    }
    
    public int quickSort(int nums[],int low,int high)
    {
        //快速排序 由大到小
        int m=nums[low];
        int i=low,j=high;
        while(i<j)
        {
          // 顺序很重要，先从后端j开始
          while(nums[j]<=m && i<j)j--;
          while(nums[i]>=m && i<j)i++;

          if(i<j)
          {
              int temp=nums[i];
              nums[i]=nums[j];
              nums[j]=temp;
          }

        }
        
        nums[low]=nums[i];
        nums[i]=m;
        return i;    
        
    }
}
