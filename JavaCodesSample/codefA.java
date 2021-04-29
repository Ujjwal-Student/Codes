import java.util.*;
import java.lang.*;
import java.io.*;

class codefA{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();

}
int c0=0;
int c1=0
int c2=0;
int max=Integer.MIN_VALUE;
int max_v=-1;
int min=Integer.MAX_VALUE;
int min_v=-1;
for(int i=0;i<n;i++)
{
	if(arr[i]%3==0)
	{
		
	c0++;
	if(max<c0)
	{
	max=c0;
	max_v=0;
	}
	if(min>c0)
	{
	min=c0;
	min_v=0;
	}
	}
	if(arr[i]%3==1)
	{
	c1++;
	if(max<c1)
	{
	max=c1;
	max_v=1;
	}
	if(min>c1)
	{
	min=c0;
	min_v=1;
	}
	}
	if(arr[i]%3==2)
	{
	c2++;
	if(max<c2)
	{
	max=c2;
	max_v=2;
	}
	if(min<c2)
	{
	min=c2;
	min_v=2;
	}
	}
	
}
if(c1==c0 && c0==c2)
System.out.println(0);
else
{
	
}



}
}
static int countPr(int min,int max)
{
int count=0;
while(min<max)
{
min=min*2;
count++;
}
return count-1;
}

}