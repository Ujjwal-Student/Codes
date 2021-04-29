import java.util.*;
import java.io.*;
import java.lang.*;

class mostFrequent{

static int countNumConc(int left,int right,int occ,List<Integer> li)
{

     
	 Map<Integer, Integer> duplicates = new HashMap<Integer, Integer>(); 
	 List<Integer> list=new ArrayList<Integer>();
	 
	 for(;left<right;left++)
	 {
	    list.add(li.get(left));
	 
	 }
 
      for (Integer str : list) { 
         if (duplicates.containsKey(str)) { 
            duplicates.put(str, duplicates.get(str) + 1); 
			if(duplicates.get(str)>=occ)
			return str;
			   
         } else { 
            duplicates.put(str, 1); 
         } 
      } 
	 
  return -1;
}
   public static void main(String[] Args)
   {
   
   Scanner sc=new Scanner(System.in);
   List<Integer> list=new ArrayList<Integer>();
   int n=sc.nextInt();
   int t=sc.nextInt();
   for(int i=0;i<n;i++)
   {
     list.add(sc.nextInt());
   }
   
   while(t>0)
   {
      System.out.println(countNumConc(sc.nextInt(),sc.nextInt(),sc.nextInt(),list));
   t--;
   }
}
}