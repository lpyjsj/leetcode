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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length<=0 ||inorder.length<=0 || preorder.length!=inorder.length)
        return null;
        return ConstructTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    
    public TreeNode ConstructTree(int[] preorder,int startpre,int endpre,int[] inorder,int startin,int endin)
    {
        if(startpre>endpre || startin>endin)
        return null;
        TreeNode node=new TreeNode(0);
        int rootval=preorder[startpre];
        node.val=rootval;
        int i;
        for( i=startin;i<=endin;i++)
          if(inorder[i]==rootval) break;
        
        node.left=ConstructTree(preorder,startpre+1,startpre+i-startin,inorder,startin,i-1);  
        node.right=ConstructTree(preorder,startpre+i-startin+1,endpre,inorder,i+1,endin);  
        return node;
    }
}