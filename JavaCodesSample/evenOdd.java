import java.util.*;
import java.io.*;
import java.lang.*;


class evenOdd{

public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
long k=sc.nextLong();
long oddN;
if(n%2==0)
oddN=n/2;
else 
oddN=n/2 + 1;

//System.out.println(oddN);

if(k<=oddN)
System.out.println((k*2)-1);
else
System.out.println((k-oddN)*2);


}
}