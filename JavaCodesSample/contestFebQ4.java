import java.util.*;
import java.lang.*;
import java.io.*;

class contestFebQ4{

public static int index(int val,int[] arr,int n)
{
 for(int i=0;i<n;i++)
 {
   if(arr[i]==val)
   return i;
   if(arr[n-i-1]==val)
   return n-i-1;
 }
 return 0;
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
	int out=0;
int n=sc.nextInt();
int[] weight=new int[n];
int[] jump=new int[n];
for(int i=0;i<n;i++)
weight[i]=sc.nextInt();
for(int i=0;i<n;i++)
jump[i]=sc.nextInt();


int[] index=new int[n];
for(int i=1;i<=n;i++)
index[i-1]=index(i,weight,n);






for(int i=1;i<n;i++)
{
	int temp1=index[i];
	int temp2=index[i-1];
	int temp=0;
	if(temp1<=temp2)
	{
	temp=(int) (Math.ceil((temp2+1-temp1)/jump[temp1]));
	if(temp==0)
	temp=temp+1;
	out+=temp;
	index[i]+=temp*(jump[temp1]);
	}
}
System.out.println(out);

}
}
}