import java.util.*;
import java.lang.*;
import java.io.*;

class chefAndAnts{
   public static void main(String[] args)
   {
   
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t--!=0)
   {
   List<Integer> list=new ArrayList<Integer>();
   int n=sc.nextInt();
   int count=0;
   while(n--!=0)
   {
   
   List<Integer> list1=new ArrayList<Integer>();
   List<Integer> list2=new ArrayList<Integer>();
   int m=sc.nextInt();
   int size1 = 0;
   int size2=0;
   
   for(int i=0;i<m;i++)
   {
   int scan=sc.nextInt();
   if(scan<0)
   {
   list1.add(scan-(2*scan));
   size1++;
   }
   else
   {
   list2.add(scan);
   size2++;
   }
   
   }//for loop insert negative and positive element
   
   count=count+size1*size2;
   for (Integer element : list1) { 
  
            // If this element is not present in newList 
            // then add it 
            if (!list2.contains(element)) { 
  
                list2.add(element); 
            } 
        }
   for (Integer element : list2) { 
			
                list.add(element); 
			
        }		
  System.out.println();
   
   }
   Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
  
        for (Integer i : list) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
			if(val.getValue()>1)
			{
				count++;
			}
		}
   System.out.println(count);
   }
   
   
   }


}