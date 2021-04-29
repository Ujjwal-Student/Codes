import java.util.*;
import java.io.*;
import java.lang.*;

class permutaionCycle{
public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);

   int len=sc.nextInt();
   int arr[]=new int[len];
   for(int i=0;i<len;i++)
   arr[i]=sc.nextInt();
   LinkedList<Integer> list1=new LinkedList<Integer>();
   String s="";
   int count=0;
   for(int i=0;i<len;i++)
   {
     int j=arr[i];
	 boolean flag=false;
	 LinkedList<Integer> list=new LinkedList<Integer>();
	 int k=0;
	 list.add(i+1);
	 if(!list1.contains(i+1))
	 while(j<=len && k<len)
	 {
	    if(list.contains(j))
		{
		flag=true;
		list.add(j);
		break;
		
		
		}
		list.add(j);
	 
	    j=arr[j-1];
		k++;
	 }
	 if(flag)
	 {
		 for(int l=0;l<list.size()-1;l++)
		 {
			 s=s+list.get(l)+" ";
		 }
		 s=s+list.get(list.size()-1);
		 if(i<len-1)
		 {
		   s=s+"\n";
		 }
		 count++;
	 }
	 list1.addAll(list);
	 list.clear();
	 
   
   }
   System.out.print(count+"\n"+s);

}

}