
/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
                
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();
        
        int total=0;
        TreeNode node=root;
        TreeNode visited=null;
        while(!stack.isEmpty()|| node!=null)
        {
          while(node!=null)
          {
             total+=node.val;
             stack.push(node);
             node=node.left;
          }
          node=stack.peek();
          
          if(total==sum&&node.right==null&&node.left==null) 
           { 
            ArrayList<Integer> alist=new ArrayList<Integer>();
            for(ListIterator<TreeNode> it=stack.listIterator(0);it.hasNext();)
            alist.add(it.next().val);
            Collections.reverse(alist);
            list.add(alist) ;
           }
          
          if(node.right==null || visited==node.right)
            {
              total-=node.val;
              visited=node;
              node=null;
              stack.pop();
            }
          else
            node=node.right;    
        }
        return list;
        
    }
}