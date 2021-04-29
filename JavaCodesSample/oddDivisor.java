import java.util.*;
import java.io.*;
import java.lang.*;
class oddDivisor{

public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 while(t--!=0)
 {
 long num=sc.nextLong();
 if(num%2==1)
 {
 System.out.println("Yes");
 
 }
 else
 {
 int No=0;
 for(int i=3;i<=19;i=i+2)
 {
    if(num%i==0)
	{
	No=1;
	break;
	
	}
	
 }
  System.out.println(num);
 if(No==0)
 System.out.println("NO");
 else 
 System.out.println("YES");
 }
 }
}
}