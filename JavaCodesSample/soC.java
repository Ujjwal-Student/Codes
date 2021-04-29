import java.lang.Math;
import java.util.Scanner;

public class soC{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
long n=sc.nextLong();
if(n==1)
{
System.out.println("No");
}
else
{
	
	
	int num=10001;
	boolean flag=true;
	for(int i=1;i<Math.min(n,num);i++)
	{
		long cube=i*i;
		cube*=i;
		long number=n-cube;
		double value=(double) Math.cbrt(number);
		//if(i>5778 && i<5780)
		//System.out.println(value+"    "+number+"           "+ i+"      "+value+"    Cube   "+cube +"     "+n);
		if(number>0)
		if(Math.ceil(value)==value)
		{
			//System.out.println(value+"    "+number+"           "+ i+"      "+value);
		flag=false;
		break;
		}
	}

if(flag)
System.out.println("No");
else{
System.out.println("Yes");
}

}
}
}
}
