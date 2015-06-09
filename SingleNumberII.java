//Given an array of integers, every element appears three times except for one. Find that single one.

public class Solution {
    public int singleNumber(int[] nums) {
        int one=0,two=0,three=0;
        for(int i=0;i<nums.length;i++)
         {
             two|=one&nums[i];
             one^=nums[i];
             three=one&two;
             one&=~three;
             two&=~three;
         }
         return one;
    }
}

//第二种方法

int singleNumberII_36(int A[], int n)
{
	int ans = 0;
	for (int i = 0; i < 32; i++) 
	{
		int c = 0, d = 1<<i;
		for (int j = 0; j < n; j++)
			if (A[j] & d) c++;

		if (c%3) ans |= d;
	}
	return ans;
}