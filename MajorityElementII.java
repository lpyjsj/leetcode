/* Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
The algorithm should run in linear time and in O(1) space. 
*/
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        if(nums.length<=0) return list;
        
        int m=0,n=0;
        int cm=0,cn=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==m)
             cm++;
            else if(nums[i]==n)
             cn++;
			 // 这两句必须放在下面，以避免m=n
            else if(cm==0)
              {m=nums[i];cm=1;}
            else if(cn==0)
              {n=nums[i];cn=1;} 
            else
            {
             cn--;
             cm--;    
            }
        }
        
     cn=cm=0;
     for(int i=0;i<nums.length;i++)
      {if(nums[i]==m) cm++;
       else if(nums[i]==n) cn++;
          
      }
      
     if(3*cm>nums.length && !list.contains(m)) list.add(m);  
     if(3*cn>nums.length && !list.contains(n)) list.add(n); 
     
     return list;
    }
}