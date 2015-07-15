//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).


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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
         return true;
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty())
        {
            TreeNode right=stack.pop();
            TreeNode left=stack.pop();
            if(right==null && left==null)
            continue;
            if(right==null || left==null)
            return false;
            if(right.val!=left.val)
            return false;
            stack.push(right.left);
            stack.push(left.right);
            stack.push(right.right);
            stack.push(left.left);

        }
       return true; 
    }
}
