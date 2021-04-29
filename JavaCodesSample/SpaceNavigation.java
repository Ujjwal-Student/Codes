import java.lang.Math;
import java.util.Scanner;

public class SpaceNavigation{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int x=sc.nextInt(),y=sc.nextInt();
int count_l=0,count_r=0,count_u=0,count_d=0;
if(x>=0)
count_r=x;
else
{
count_l=x-2*x;
}
if(y>=0)
count_u=y;
else
{
count_d=y-2*y;
}
String s=sc.next();
long n=s.length();
int countL=0,countR=0,countU=0,countD=0;
for(int i=0;i<n;i++)
{
if(s.charAt(i)=='L')
{
countL++;
}
else if(s.charAt(i)=='R')
{
countR++;
}
else if(s.charAt(i)=='U')
{
countU++;
}
else if(s.charAt(i)=='D')
{
countD++;
}
if(count_l<=countL && count_u<=countU && count_d<=countD && count_r<=countR )
break;
}
if(count_l<=countL && count_u<=countU && count_d<=countD && count_r<=countR )
System.out.println("Yes");
else{
System.out.println("No");
}
}
}
}