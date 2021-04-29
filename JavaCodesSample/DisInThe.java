import java.util.*;
import java.io.*;
import java.lang.*;

class DisInThe{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();

int n3=sc.nextInt();
LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>(); 
LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
LinkedHashSet<Integer> set3=new LinkedHashSet<Integer>();
LinkedHashSet<Integer> set4=new LinkedHashSet<Integer>();
while(n1--!=0)
{
set1.add(sc.nextInt());
}
while(n2--!=0)
{
set2.add(sc.nextInt());
}
while(n3--!=0)
{
set3.add(sc.nextInt());
}
Iterator<Integer> i=set1.iterator();  
               while(i.hasNext())  
               {  
			   Integer num=i.next();
               if( set2.contains(num) ||  set3.contains(num))
                 {
				 set4.add(num);

}				 
			   }
			   Iterator<Integer> i1=set2.iterator();  
               while(i1.hasNext())  
               {  
			   Integer num=i1.next();
               if(set3.contains(num))
                 {
				 set4.add(num);

}				 
			   }
			   TreeSet<Integer> tSet = new TreeSet<Integer>(set4); 
 
        // Iterating using enhanced for-loop
        System.out.println(set4.size());	
        for(Integer company : tSet) {
            System.out.println(company);
        }
			   
			   
			   
		   
}
}