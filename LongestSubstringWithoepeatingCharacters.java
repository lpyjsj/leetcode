/*Given a string, find the length of the longest substring without repeating characters. 
For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
*/


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        int longestlength=0,length=0,index=-1;
        for(int i=0;i<s.length();i++)
         {
            Character c=s.charAt(i);   
           if(map.containsKey(c))
              index=map.get(c)>index?map.get(c):index; 
            length=i-index ;
            map.put(c,i);    
            longestlength=longestlength<length?length:longestlength;
         }
         
         return longestlength;
        
    }
}
