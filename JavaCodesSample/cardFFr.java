
import java.util.Scanner;

public class cardFFr{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int w=sc.nextInt();
int h=sc.nextInt();
long n=sc.nextLong();
long count=0;
int num1=w;
int num2=h;
while(w%2!=1)
{
	w/=2;
}
while(h%2!=1)
{
	h/=2;
}
if(num1>w)
count=num1/w;
if(count==0)
count=1;
if(num2>h)
count*=num2/h;

System.out.println(w+"           "+h+"        "+count);
if(count>=n)
System.out.println("Yes");
else
System.out.println("No");
}
}
}
