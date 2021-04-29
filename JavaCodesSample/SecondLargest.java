import java.util.*;
import java.io.*;
import java.lang.*;
class SecondLargest{
     
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[] St)
	 {
	 
	 
	     Scanner s=new Scanner(System.in);
		 int n=s.nextInt();	 
	     
		 while(n>=0){
		 
		     ArrayList<long> arr=new ArrayList<long>();
			 for(int i=0;i<3;i++)
			 arr[i]=s.nextInt();
			 Arrays.sort(arr);
			 System.out.println((int)arr[1]+"\n"+ arr[0]+arr[2]);
			 n=n-1;
		 }
		 
		 
		 
	 s.close();
	 
	 }
 
 
 
 }
 