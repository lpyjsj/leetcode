//Write a function to find the longest common prefix string amongst an array of strings.
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        if(strs.length<=0) 
         return "";
        else if(strs.length==1)
        return strs[0];
        
         for(int i=1;i<=strs[0].length();i++)
          { 
            prefix=strs[0].substring(0,i);
            for(int j=1;j<strs.length;j++)
              {
                 if(!strs[j].startsWith(prefix))
                  return prefix.substring(0,prefix.length()-1);
              }
          }
        return prefix;
    }
}