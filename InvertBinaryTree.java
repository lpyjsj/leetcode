/*Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
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
//递归方法
public class Solution {
    public TreeNode invertTree(TreeNode root) {
          if(root==null)
              return root;
         else
             {
                TreeNode temp=root.right;
                root.right=root.left;
                root.left=temp;
                invertTree(root.right);
                invertTree(root.left);
             }
             
        return root;
    }
}


//非递归方法 利用树的后序访问自下而上翻转
public class Solution {
    public TreeNode invertTree(TreeNode root) {
          if(root==null)
              return root;
          LinkedList<TreeNode> stack =new LinkedList<TreeNode>();
          TreeNode node=root;
          TreeNode visited=null;
          while(!stack.isEmpty() || node!=null)
          {
             while(node!=null)
             {
               stack.push(node);
               node=node.left;
             }
             node=stack.peek();
             if(node.right==null || node.right==visited)
             {
                TreeNode temp=node.right;
                node.right=node.left;
                node.left=temp;
                visited=node;
                node=null;
                stack.pop();
             }
             else node=node.right;
          }
             
        return root;
    }
}
