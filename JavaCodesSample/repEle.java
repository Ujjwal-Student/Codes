
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class repEle{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
boolean flag=false;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(arr[i]>k)
flag=true;
}

Arrays.sort(arr);
if(flag)
if(arr[0]>=k || arr[1]>k)
{
System.out.println("No");
}
else if(arr[0]+arr[1] > k)
System.out.println("No");
else
{
System.out.println("Yes");

}
else
System.out.println("Yes");


}
}
}
