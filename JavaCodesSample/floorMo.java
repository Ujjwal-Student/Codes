import java.lang.Math;
import java.util.Scanner;

public class floorMo{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
long a=sc.nextLong();
long b=sc.nextLong();
int count=0;
for (int i=1;i<=Math.sqrt(a);i++) 
{
	count+=Math.max(Math.min(b,a/i-1)-i,0);
}
System.out.println(count);
}
}
}