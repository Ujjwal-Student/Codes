import java.util.*;
import java.lang.*;
import java.io.*;

class ChefDivision{

  static int dayWeGet(int n,int k,long sum)
  {
  
    if(sum<k)
	return 0;
	int days=0;
	while(sum>0 && sum>=k)
	{
	days=days+1;
	sum=sum-k;
	}
	return days;
	}


  public static void main(String[] args)
  {
  
    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0)
	{
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	   int days=sc.nextInt();
	   
	   long sum=0;
	   for(int i=0;i<n;i++)
	   {
	     sum=sum+sc.nextInt();
	   }
	   
	   int daysGet=dayWeGet(n,k,sum);
	
	if(daysGet<days)
	{
	System.out.println(daysGet);
	}
	else
	{
	System.out.println(days);
	}
	   t--;
	}
  
  }


}