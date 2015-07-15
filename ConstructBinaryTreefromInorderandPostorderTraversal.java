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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
    
        if(postorder.length<=0 ||inorder.length<=0 || postorder.length!=inorder.length)
        return null;
        return ConstructTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
    
    public TreeNode ConstructTree(int[] postorder,int startpost,int endpost,int[] inorder,int startin,int endin)
    {
        if(startpost>endpost || startin>endin)
        return null;
        TreeNode node=new TreeNode(0);
        int rootval=postorder[endpost];
        node.val=rootval;
        int i;
        for( i=startin;i<=endin;i++)
          if(inorder[i]==rootval) break;
        
        node.left=ConstructTree(postorder,startpost,startpost+i-startin-1,inorder,startin,i-1);  
        node.right=ConstructTree(postorder,startpost+i-startin,endpost-1,inorder,i+1,endin);  
        return node;
    }
}