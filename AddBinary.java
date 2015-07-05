/* Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100". 
*/

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        StringBuilder a1=new StringBuilder(a).reverse();
        StringBuilder b1=new StringBuilder(b).reverse();
        int i=0,carry=0,sum=0;
        for(;i<a1.length() && i<b1.length();i++)
         {
            sum=a1.charAt(i)-'0'+b1.charAt(i)-'0'+carry;
            carry=sum/2;
            sum=sum%2;
            sb.append(sum);
         }
         
          while(i<a1.length())
          {
              sum=a1.charAt(i++)-'0'+carry;
              carry=sum/2;
              sum=sum%2;
              sb.append(sum);
          }
        
        while(i<b1.length())
          {
              sum=b1.charAt(i++)-'0'+carry;
              carry=sum/2;
              sum=sum%2;
              sb.append(sum);
          }
          
         if(carry!=0) sb.append(carry);
         
         return sb.reverse().toString();
    }
}