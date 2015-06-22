/*
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
 // 二叉树的BFS
public class Solution {
    public int minDepth(TreeNode root) {
        //int mindepth=Integer.MAX_VALUE;
        int depth=1;
        if(root==null)
         return 0;
        LinkedList<TreeNode> queue1=new LinkedList<TreeNode>(); 
        LinkedList<TreeNode> queue2=new LinkedList<TreeNode>(); 
        queue1.add(root);
        while(!queue1.isEmpty())
        {
           while(!queue1.isEmpty())    
           { TreeNode node=queue1.poll();
             if(node.left==null && node.right==null)
              return depth;
            if(node.left!=null)
            queue2.add(node.left);
           if(node.right!=null)
            queue2.add(node.right);
           }
           depth++;
           queue1.addAll(queue2);
           queue2.clear();
        }
        
      return depth;    
    }
}