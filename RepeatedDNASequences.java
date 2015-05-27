public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int length=s.length();
     /*   if(length<=10)
           return null;*/
        List<String> list=new ArrayList<String>();
       // Map m= Map<String,Integer>();
        Map<String,Integer> map=new HashMap<String,Integer>();
        String sub=""; 
        for(int i=0;i<=length-10;i++)
          {
             sub=s.substring(i,i+10); 
             if(!map.containsKey(sub))
              map.put(sub,1);
             else if(!list.contains(sub))
             { 
                 list.add(sub);
             }
         }
        
           
        return list;
    }
}