import java.util.*;
import java.io.*;
import java.lang.*;

class four
{
static int countNumberOfFour(int num){
   int count=0;
   while(num!=0){
      int k=num%10;
	  if(k==4)
	  {
	      count++;
	  }
	  num=num/10;
	}
	return count;
}
	     
public static void main(String[] args){
   
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   while(n!=0){
   int num=s.nextInt();
   int count=countNumberOfFour(num);
   System.out.println( "output :"+count);
   n--;
   }
   
   s.close();
   }
}