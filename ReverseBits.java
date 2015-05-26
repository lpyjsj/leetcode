public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
  	int i=0,result=0;
	//	int flag=1;
	    int loop=32;
		while(loop!=0)
		{
		  result=result<<1;	
		  i=n&1;
		  result=result+i;
		  n=n>>1;
		  loop--;
		}
		
		return result;
    }
}