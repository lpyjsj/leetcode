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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
              
        List<List<Integer>> list=new ArrayList<List<Integer>>(); 
        if(root==null)
         return list ;
        LinkedList<TreeNode> queue1=new LinkedList<TreeNode>(); 
        LinkedList<TreeNode> queue2=new LinkedList<TreeNode>(); 
        queue1.add(root);
        while(!queue1.isEmpty())
        {
            List<Integer> alist=new ArrayList<Integer>();
           while(!queue1.isEmpty())    
           { 
            TreeNode node=queue1.poll();
            alist.add(node.val);
            if(node.left!=null)
            queue2.add(node.left);
           if(node.right!=null)
            queue2.add(node.right);
           }
           list.add(alist);    
           queue1.addAll(queue2);
           queue2.clear();
        }
        
        for(int i=0,j=list.size()-1;i<j;i++,j--)
          {
             List<Integer> temp=list.get(i);
             list.set(i,list.get(j));
             list.set(j,temp);
          }
         
        
        return list;
        
    }
}
