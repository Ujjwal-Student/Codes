import java.util.*;
import java.lang.*;
import java.io.*;

class WatchCpl
{
  public static void main(String[] Args)
  {
    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t--!=0)
	{
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	   int sum1=0;
	   List<Integer> list=new ArrayList<Integer>();
	   for(int i=0;i<n;i++)
	   {
	   list.add(sc.nextInt());
	   sum1=sum1+list.get(i);
	   }
	   if(sum1<2*k)
	   System.out.println(-1);
	   else
	   {
	   Collections.sort(list);
	   int num=Integer.MAX_VALUE;
	   List<Integer> stack=new ArrayList<Integer>();
	   stack.add(list.get(n-1));
	   for(int i=n-2;i>=0;i--)
	   {
		    List<Integer> list1=new ArrayList<Integer>();
		   list1.add(list.get(n-1));
		   if(list.get(n-1)>k)
		   break;
	   int sum=list.get(n-1)+list.get(i);
	  
	   
	   list1.add(list.get(i));
	   for(int j=i-1;j>=0;j--)
	   {
		 
		 if(i!=j)
		 {
			 if(sum>=k)
			 break;
			 sum=sum+list.get(j);
		     list1.add(list.get(j));
			 
		 }
	   
	   }
	   System.out.println("List1 Elements in the List:  " +list1);
	   if(sum>=k && num>sum)
	   {
		    num=sum;
			stack.clear();
			stack.addAll(list1);
			
	   }
	   if(num==k)
	   {
		   break;
	   }
	   
	   }
	   int count=stack.size();
	   System.out.println("Stack Values In My prog:"+stack);
	   list.removeAll(stack);
	   System.out.println("List Values In My prog:"+list);
	   int sum2=0;
	   for(int i=list.size()-1;i>=0;i--)
	   {
		   sum2=sum2+list.get(i);
		   count++;
		   if(sum2>=k)
		   break;
	   }
	   
	   System.out.println(count);
	
	}
	}
  
  
  }


}