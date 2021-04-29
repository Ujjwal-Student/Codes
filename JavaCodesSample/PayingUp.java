import java.util.*;
import java.io.*;
import java.lang.*;

class PayingUp{

public static int getIndex(List<Integer> list,int n,int k)
{
 n=n-1;   
   for(;n>=0;n--)
   {
       if(list.get(n)<=k)
	   {
	      k=k-list.get(n);
	   }
	   if(k==0)
	   break;
   
   }

if(k==0)
System.out.println("Yes");
else
System.out.println("No");
return 0;

}
public static void main(String[] args)
{

    Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0)
	{
	
	int n=s.nextInt();
	int k=s.nextInt();
	List<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	   list.add(s.nextInt());
	Collections.sort(list);
    int index=getIndex(list,n,k);  
	
	t--;
	
	
	}



}



}