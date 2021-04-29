import java.util.*;
import java.io.*;
import java.lang.*;

class EnormousInputTest{
     
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[] St)
	 {
	 
	 
	     Scanner s=new Scanner(System.in);
		 int n=s.nextInt();	 
	     int k=s.nextInt();
		 
		 
		 int count=0;
		 while(n!=0)
		 {
		 
		     long num=s.nextInt();
			 if(num%k==0)
			    count++;
		     n=n-1;
		 }
	 System.out.print(count);
	 s.close();
	 
	 }
 
 
 
 }
 