import java.lang.*;
import java.io.*;
import java.util.*;

class minionsVoting
{
	
	public static int findSum(int[] a,int index,int j)
	{
		int sum=0;
		if(index==j)
		;
		else if(index>j)
		{
			for(;index>j+1;++j)
			{
				sum=sum+a[j+1];
			}
			
		}
		else if(j>index)
		{
			
			
			for(;index+1<j;++index)
			{
				sum=sum+a[index+1];
			}
			
			
		}


        return sum;
			
		
		
		
	}
	
	
	
	public static int minionCount(int[] a ,int index)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(index==i);
			else
			{
				
				int sum=findSum(a,index,i);
				if(a[i]>=sum)
				count++;
				System.out.println("Sum    "+sum); 
			}
			
		}
		
		return count;
		
	}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
  a[i]=s.nextInt();
  
  int out[]=new int[n];
for(int i=0;i<n;i++){
   out[i]=minionCount(a,i);
   
   

}
for(int i=0;i<n;i++){
	System.out.print(out[i]+" ");
}
System.out.println();
  
t--;
}
s.close();

}
}