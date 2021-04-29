import java.util.*;
import java.lang.*;
import java.io.*;

class pointOfImpact{
 
    public static void main(String[] Args)
	{
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t--!=0)
	 {
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   int count=0;
	   if(x>y)
	   count=0;
	   else if(y>x)
	   count=1;
	   for(int j=0;j<k;j++)
	   {
	       if(x==0 && y==0)
		   {
		  
		   x=5;
		   y=5;
		   break;
		   }
		    else if(x==5 && y==5)
		   {
		   x=5;
		   y=5;
		   
		   break;
		   }
		    else if(x==0 && y==5)
		   {
		   
		   x=0;
		   y=5;
		   break;
		   }
		    else if(x==5 && y==0)
		   {
		   x=5;
		   y=0;
		   break;
		   }
		   else if(x==y){

		   break;
		   }
		   else{
		   
		   
		   
		   
		   int diff;
		   if(count==0)
		   {
		   if(x>y && x!=n)
		   {
		    diff=n-x;
			x=x+diff;
			y=y+diff;
		   
		   }
		   else if(y>x && y!=n)
		   {
		   diff=x;
		   x=y;
		   y=diff;
		   }
		   else if(x==n)
		   {
		   diff=x;
		   x=y;
		   y=diff;
		   }
		   else if(y==n)
		   {
		   
		   y=y-x;
			x=0;
		   
		   }
		   
		   }
		   
		   if(count==1)
		   {
		   
		   if(x>y && x!=n)
		   {
		    diff=x;
		   x=y;
		   y=diff;
		   //System.out.println(x+"  " +y);
		   }
		   else if(y>x && y!=n)
		   {
		   
		   diff=n-y;
			x=x+diff;
			y=y+diff;
			//System.out.println(x+"  " +y);
		   }
		   else if(x==n)
		   {
		   x=x-y;
		   y=0;
		   //System.out.println(x+"  " +y);
		   }
		   else if(y==n)
		   {
		   
		   diff=y;
		   y=x;
		   x=diff;
		   //System.out.println(x+"  " +y);
		   
		   }
		   
		   
		   }
		   
		   
		   
		   }
		  
	   
	   }
	   System.out.println(x+" "+y);
	 
	 }
	
	
	}

}