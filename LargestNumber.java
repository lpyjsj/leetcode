public class Solution {
    public  String largestNumber(List<Integer> num) {
     StringBuilder str=new StringBuilder();
     Collections.sort(num,new IntegerComparator());
     

     if(num.get(0)==0) 
          return "0";
     for(Integer i:num)
         str.append(i);
      
      return str.toString(); 
        
    }
}

class IntegerComparator  implements Comparator<Integer>{
  public   int compare(Integer a,Integer b)
         {
             String s1=""+a+b;
             
             String s2=""+b+a;
             
             return s2.compareTo(s1);
         }
     }