/*
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String > list =new ArrayList<String>();
        if(nums.length<=0) return list;
        if(nums.length==1) 
         list.add(nums[0]+"");

        int start=nums[0];
        int end=start;
        //sb.append(start);
        for(int i=1;i<nums.length;i++)
        {
          
            if(nums[i]!=end+1)
            {
              //StringBuilder sb=new StringBuilder();
              if(end>start)
               list.add(start+"->"+end);
              else
               list.add(start+"");
            start=nums[i];
            end=start;
            }
           else
              end++;
              
          if(i==nums.length-1)
            {
              end=nums[i];
              if(end>start)
               list.add(start+"->"+end);
              else
               list.add(start+"");
                
            }
          
            
        }
        return list;
        
    }
}
