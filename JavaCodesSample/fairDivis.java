
import java.lang.Math;
import java.util.*;

public class fairDivis{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int ones=0;
int twos=0;
for(int i=0;i<n;i++)
{
int num=sc.nextInt();
if(num==1)
ones++;
if(num==2)
twos++;
}
if(twos%2==0)
{
if(ones%2==0)
System.out.println("Yes");
else
System.out.println("No");
}
else
{
	if(ones>=2)
	{
ones-=2;
if(ones%2==0)
System.out.println("Yes");
else
System.out.println("No");
	}
	else{
		System.out.println("No");
	}

}
}
}
}
