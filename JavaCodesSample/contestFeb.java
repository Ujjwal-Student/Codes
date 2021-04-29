
import java.util.*;
import java.lang.*;
import java.io.*;

class contestFeb{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=10;i>=1;i--)
{
   if(num%i==0)
   {
   System.out.print(i);
   break;
   }
}

}

}