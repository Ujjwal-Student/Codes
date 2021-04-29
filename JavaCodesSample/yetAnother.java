
import java.lang.Math;
import java.util.*;

public class yetAnother{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
char[] str=sc.next().toCharArray();
int n=str.length;
for(long i=0;i<n;i++)
{
	int j=(int) i;
if(i%2==0)
{
if(str[j]=='a')
str[j]='b';
else
str[j]='a';
}
else
{
if(str[j]=='z')
str[j]='y';
else
str[j]='z';
}
}
System.out.println(str);

}
}
}
