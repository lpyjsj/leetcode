public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int number=0;
        
        while(n!=0)
        {
            
            number++;
            n=n&(n-1);
        }
        return number;
    }
}