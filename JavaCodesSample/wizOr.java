
import java.util.Scanner;


public class wizOr{
public static void main(String[] args)
{
	int j=9;
	String str="";
	for(int i=0;i<100000;i++)
{
if(j==0)
{
str+=j;
j=9;

}
else
{
str+=j;
j--;
}

}
	
	
	
	
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();


//System.out.println(str);
while(t-->0)
{
int n=sc.nextInt();
for(int i=0;i<n;i++)
System.out.print(str.charAt(i));
System.out.println();
}
}
}