
import java.lang.Math;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class helpNezzar{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
int num=sc.nextInt();
int count=1;
int ans=0;
for(int i=1;i<n;i++)
{
	int value=sc.nextInt();
if(num==value)
{
	count++;
}
else
{
	num=value;
	if(ans<count)
	ans=count;
	count=1;
}

}	
if(ans==0 || ans<count)
ans=count;

System.out.println(ans);
}
}
}
