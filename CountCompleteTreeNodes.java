/*
Given a complete binary tree, count the number of nodes.
*/

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
    public int countNodes(TreeNode root) {
        int deepthOfTree=0;
        int count=0;
        TreeNode node=root;
        for(;node!=null;node=node.left) 
            deepthOfTree++;
            
        node=root; 
        int level=1,deepthOfsubtree=0;
        while(node!=null)
        {
          if(node.right==null && node.left==null)
          count++;    
         // if(node.right!=null)    
          deepthOfsubtree=deepth(node.right,level);
          if(deepthOfsubtree<deepthOfTree)
             {
                 node=node.left;
                 level++;
             }
          else
            {
             count+=Math.pow(2,deepthOfTree-level-1); //add the number of nodes of left subtree in the last level
             node=node.right;
             level++;
            }
        }
        
      count+=Math.pow(2,deepthOfTree-1)-1;//add the number of nodes beside the last
      return count;
    }

    int deepth(TreeNode node,int deepth)
    {
         while(node!=null)
        {
              deepth++;
              node=node.left;
        }
        return deepth;
    }
}