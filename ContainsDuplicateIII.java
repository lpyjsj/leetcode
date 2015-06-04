/*Given an array of integers, find out whether there are two distinct indices i and j in the array 
such that the difference between nums[i] and nums[j] is at most t 
and the difference between i and j is at most k.
*/


public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int length=nums.length;
        if(length<=1) return false;
      //  t=t>0?t:-t;
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int i=0;i<length;i++)
        {
          Integer up=ts.floor(nums[i]+t);
          Integer down=ts.ceiling(nums[i]-t);
          if((up!=null && up>=nums[i])|| (down!=null && down<=nums[i]))
           return true;
          ts.add(nums[i]);  
          if(ts.size()>k)
           ts.remove(nums[i-k]);
        }
        return false;
       }
}
 