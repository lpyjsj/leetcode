//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return constructBST(nums,0,nums.length-1);
    }
    
    public TreeNode constructBST(int[] nums,int start,int end)
    {
       if(end<start) return null;
       else if(end==start) 
         return new TreeNode(nums[start]);
       int middle=(start+end)/2;     
       TreeNode root=new TreeNode(nums[middle]);
       root.right=constructBST(nums,middle+1,end);
       root.left=constructBST(nums,start,middle-1);
       return root;

    }
}