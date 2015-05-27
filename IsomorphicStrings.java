public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap hashmap=new HashMap();
        int length=s.length();
        int i=0;
        while(i<length)
        {
          char s1=s.charAt(i);
          char t1=t.charAt(i);
         
          if(!hashmap.containsKey(s1) && !hashmap.containsValue(t1))
            hashmap.put(s1,t1);
          else
            {  if (!hashmap.containsKey(s1))
                return false;
              else
              {    
               char ts=(char) hashmap.get(s1);
               if(t1!=ts)
                  return false;
                  
              }
            }
            i++;
        }
        return true;
    }
}