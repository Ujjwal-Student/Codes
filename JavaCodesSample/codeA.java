import java.util.*;
import java.lang.*;
import java.io.*;
 
public class codeA{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
// write your code here
int n=sc.nextInt();
long count=0;
long arr[]=new long[n];
long b=0;
for(int i=0;i<n;i++)
{
	arr[i]+=sc.nextLong();
	if(arr[i]>i)
	{
		b=b+arr[i]- i;
		arr[i]=i;
		//System.out.println("if"+b);
	}
	else
	{
		arr[i]+=b;
		b=0;
		if(arr[i]>i)
	{
		b=b+arr[i]-i;
		arr[i]=i;
		//System.out.println("else"+b);
	}
		
	}
	
	
}
arr[n-1]+=b;
System.out.println("last value     "+arr[n-1]);
boolean flag=true;
for(int i=1;i<n;i++)
if(arr[i-1]>=arr[i])
{
	flag=false;
	break;
}
if(flag)
System.out.println("Yes");
else{
	System.out.println("No");
 
}
}
}
}