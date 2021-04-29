import java.util.*;
import java.io.*;
import java.lang.*;
class SchoolOfGeometry{
     
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[] St)
	 {
	 
	 
	     Scanner s=new Scanner(System.in);
		 int n=s.nextInt();	 
	     
		 while(n>0){
		 
		     int width[]=new int[s.nextInt()];
			 int hight[]=new int[width.length];
			 for(int i=0;i<width.length;i++)
			 width[i]=s.nextInt();
			 for(int i=0;i<hight.length;i++)
			 hight[i]=s.nextInt();
			 Arrays.sort(width);
			 Arrays.sort(hight);
			 int sum=0;
			 for(int i=0;i<width.length;i++)
			 {
			     sum=sum+Math.min(width[i],hight[i]);
			 }
			 System.out.println(sum);
			 n=n-1;
		 }
		 
		 
		 
	 s.close();
	 
	 }
 
 
 
 }
 