import java.util.Scanner;
import java.util.Arrays;
public class javaCodeArena{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int min=10000;
int[] arr=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(min>arr[i])
min=arr[i];

}
int count=0;
for(int i=0;i<n;i++)
{
if(arr[i]!=min)
count++;
}
System.out.println(count);
}
}
}