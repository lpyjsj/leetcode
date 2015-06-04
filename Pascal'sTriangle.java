//Given numRows, generate the first numRows of Pascal's triangle.

public class Solution {
    public List<List<Integer>> generate(int numRows) {
       // if(numRows<=0) return null;
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++)
        { 
         List<Integer> innerList=new ArrayList<Integer>();
         for(int j=0;j<=i;j++)
           {  
               if(j==0||j==i)
               innerList.add(1);
               else
                innerList.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
           }
         list.add(innerList);
        }
        return list;
    }
}