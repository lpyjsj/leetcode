/*
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

*/
public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1=version1.split("\\."); //这里需要转义
        String[] s2=version2.split("\\.");
        int i;
        for( i=0;i<s1.length && i<s2.length;i++)
        {
           int n1=Integer.parseInt(s1[i]);
           int n2=Integer.parseInt(s2[i]);
           if(n1==n2) continue;
           else if(n1<n2) return -1;
           else return 1;
           
        }
       if(i<s1.length && Integer.parseInt(s1[i])!=0) 
       return 1;
       else if(i<s2.length && Integer.parseInt(s2[i])!=0) 
       return -1;
       
       return 0;       
    }
}