
import java.util.*;
import java.lang.*;
import java.io.*;

class contestFebQ2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
   a[i]=sc.nextInt();
}
Arrays.sort(a);
int x=a[0];
int y=a[n-1];
int z=a[1];
int sum=Math.abs(x-y)+Math.abs(y-z)+Math.abs(z-x);
for(int i=2;i<n-1;i++)
{
   z=a[i];
   int max=Math.abs(x-y)+Math.abs(y-z)+Math.abs(z-x);
   if(sum<max)
   sum=max;
}
System.out.println(sum);
}
}

}