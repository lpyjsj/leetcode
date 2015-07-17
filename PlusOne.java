/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

*/

public class Solution {
    public int[] plusOne(int[] digits) {
        int[] result=new int[digits.length];
        for(int i=0;i<digits.length;i++)
          result[i]=0;
        int carry=1;  
        for(int i=digits.length-1;i>=0;i--)
        {
           result[i]=(digits[i]+carry)%10;
           carry=(digits[i]+carry)/10;
        }
       if(carry==0)
         return result;
       else
       {
           int[] results=new int[digits.length+1]; 
           results[0]=carry;
           for(int i=0;i<digits.length;i++)
           results[1+i]=result[i];
           return results;
       }
            
    }
}
