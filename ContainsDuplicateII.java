public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length=nums.length;
        if(length<=1) return false;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<length;i++)
        {
          if(!map.containsKey(nums[i]))
            map.put(nums[i],i);
          else
           {
             int index=map.get(nums[i]);
             if(i-index>k)
             map.put(nums[i],i);
             else 
              return true;
           }
        }
        return false;
        
    }
}
