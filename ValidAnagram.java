/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

*/

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;
          
        boolean result=true;  
        
        HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
         {
            Character c=s.charAt(i);
            if(!hashmap.containsKey(c))
              hashmap.put(c,1);
            else
              {
                  int count=hashmap.get(c);
                  hashmap.put(c,count+1);
              }
             
         }
         
       for(int i=0;i<t.length();i++)
         {
            Character c=t.charAt(i);
            if(!hashmap.containsKey(c))
               {result=false;break;}
            else
              {
                  int count=hashmap.get(c);
                  hashmap.put(c,count-1);
              }
             
         }
         
         for(Integer value:hashmap.values())
           if(value!=0)
                {
                    result=false;
                    break;
                }
         
         return result;
        
    }
}
