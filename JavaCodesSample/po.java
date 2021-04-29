import java.util.*;
import java.io.*;
import java.lang.*;
class po
{

public static void main(String[] Args)
{

Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int num=sc.nextInt();
int k=num%10;
k=k*2021;
num=num-k;
System.out.println(num);
if((num%2020)==0 && num>=0)
System.out.println("YES");
else
System.out.println("NO");
}

}

}