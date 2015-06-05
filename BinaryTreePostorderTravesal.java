/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //第一种方法 将后序转换为类似前序的过程，即先访问node,然后node.right,node.left,最后将结果翻转过来
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       Stack<TreeNode> node=new Stack<TreeNode>();
       //Stack<Integer>  value=new Stack<Integer>();
       ArrayList<Integer> list=new ArrayList<Integer>();
       if(root!=null)    
         node.push(root);
       while(!node.empty())
       {
            TreeNode treenode= node.pop();
           // value.push(treenode.val);
              list.add(treenode.val);
          
           if(treenode.left!=null)
                 node.push(treenode.left);
           
           if(treenode.right!=null)
             node.push(treenode.right);

       }
      /* while(!value.empty())     
         list.add(value.pop());
      */   
       Collections.reverse(list);
       return list;     
    }
}
//第二种方法实现真正的后序非递归
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       LinkedList<TreeNode> node=new LinkedList<TreeNode>();
       ArrayList<Integer> list=new ArrayList<Integer>();
       
         TreeNode visited=new TreeNode(-1);
         TreeNode treenode=root;
       while(!node.isEmpty() || treenode!=null)
       {
           while(treenode!=null)
            {
                node.push(treenode);
                treenode=treenode.left;
            }
          treenode=node.peek();
          if(treenode.right==null || visited==treenode.right)
           {
             list.add(treenode.val);  
             visited=treenode;
             treenode=null;
             node.pop();
           } 
          else
            treenode=treenode.right;
       }
 
       return list;     
    }
}
