import java.util.Scanner;
import java.lang.Math;
class divQuest1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
	
int n=sc.nextInt();
int k=sc.nextInt();
String str=sc.next();
String strR="";
for(int i=n-1;i>=0;i--)
{
	strR+=str.charAt(i);
}
String s="";
for(int i=0;i<=k;i++)
{
s+=str.charAt(i);
}
for(int i=n-k-2;i>=0;i--)
{
s+=str.charAt(i);
}
//System.out.println(str+"      "+s+"   revrese String     "+strR);
float a=(float) n/2;
a=(float) Math.ceil(a);
int num=(int) a;
if(k<a)
{
if(k==0)
{
System.out.println("Yes");
}
else{
	boolean flag=true;
	for(int i=0;i<n;i++)
	{
	   if(str.charAt(i)!=s.charAt(i))
	   {
		   flag=false;
		   break;
	   }
	   
	}
	if(flag)
	System.out.println("Yes");
	else{
		System.out.println("No");
	}
}
}
else
System.out.println("No");

}

}

}