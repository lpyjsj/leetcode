public class Solution {
    public List<Integer> getRow(int rowIndex) {
     
     List<Integer> first=new ArrayList<Integer>();
     for(int i=0;i<rowIndex+1;i++)
     {
       List<Integer> second=new ArrayList<Integer>(); 
       
       for(int j=0;j<=i;j++)
       {
         if(j==0 ||j==i)
           second.add(1);
         else
           second.add(first.get(j-1)+first.get(j));
       }
      first=second;
    }
    return first;
}
}
