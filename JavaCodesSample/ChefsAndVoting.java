import java.util.*;
import java.io.*;
import java.lang.*;
class ChefsAndVoting{


    public static int CountVotes(int[] arr)
	{
	
	    int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			
			 if(arr[i]>=arr.length)
			 return -1;
			 sum=sum+arr[i];
			 if(sum>arr.length)
			 return -1;
		
		
		}
	
	
	return 4;
	
	
	}

      public static void main(String[] Args){
	  
	  
	    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0){
			
			
			int n1=s.nextInt();
			
		  		int arr[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
		     arr[i]=s.nextInt();
		
		
		}
		if(CountVotes(arr)==-1)
		   System.out.println("-1");
		   else
		   {
			   for(int i=0;i<n1-1;i++)
			   {
				   
				   System.out.print(i+2+" ");
				   
			   }
			   System.out.println(1);
		   }
			   n=n-1;
		  
		  }
	  
	  
	  
	  }


}