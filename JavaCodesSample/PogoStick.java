import java.util.*;
import java.io.*;
import java.lang.*;

class PogoStick{

public static void main(String[] Args){

Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}


int output=arr[0];
for(int i=0;i<n;i++)
{
int out=0;
out=out+arr[i];
for(int j=i+k;j<n;j=j+k)
{
out=out+arr[j];
}
if(output<out)
output=out;

}
System.out.println(output);
}

}

}