public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
     int length=nums.length;
     if(length==0)
     return false;
     HashMap map=new HashMap();
     for(int i=0;i<length;i++)
     { if(!map.containsKey(nums[i]))
           map.put(nums[i],1);
      else return true;       
     }
     return false;
        
    }
}