
import java.lang.Math;
import java.util.*;

public class oddDivi{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
long n=sc.nextLong();
boolean flag=false;
while(n>1)
{
	if(n%2==1)
	{
		flag=true;
		break;
	}
	n=n/2;
}
if(flag)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}

}
}
}
