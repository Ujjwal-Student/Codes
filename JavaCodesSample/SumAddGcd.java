
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger; 
class SumAddGcd
{
   public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  


   public static void main(String[] Args)
   {
   
   
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   while(n>0)
   {
   
      int k=s.nextInt();
	  int[] arr=new int[k];
	  
	  for(int i=0;i<k;i++)
	  {
	  arr[i]=s.nextInt();
	  }
	  
	  Arrays.sort(arr);
	  k=removeDuplicateElements(arr,k);
	  
	  
	List<Integer> even=new ArrayList<Integer>();
	List<Integer> odd=new ArrayList<Integer>();
	
	
	//System.out.print("REMOVE ARRAY \n");
      for(int i=0;i<k;i++){
      //System.out.print(arr[i]+" ");
      if(arr[i]%2==0)
	  even.add(arr[i]);
	  else
	  odd.add(arr[i]);
	  


}	
//System.out.println();


    int sum=0;
    if(!even.isEmpty())	
	{
		//System.out.println(" Even Size "+even.size());
	   if(even.size()>1)
	   {
	   
	      BigInteger even1=BigInteger.valueOf(even.get(0));
		  BigInteger even2=BigInteger.valueOf(even.get(1));
		  
		  BigInteger gc=even1.gcd(even2);
		  //System.out.println("GCD EVEN "+gc);
		  sum=sum+gc.intValue();
		  
	   }
	   else
	   sum=sum+even.get(0);
	
	}
	if(!odd.isEmpty())	
	{
	//System.out.println( "odd Size "+odd.size());
	   if(odd.size()>1)
	   {
	   
	      BigInteger odd1=BigInteger.valueOf(odd.get(0));
		  BigInteger odd2=BigInteger.valueOf(odd.get(1));
		  
		  BigInteger gc1=odd1.gcd(odd2);
		  //System.out.println("GCD ODD    "+gc1);
		  sum=sum+gc1.intValue();
		  
	   }
	   else
	   sum=sum+odd.get(0);
	
	}
	  
	  System.out.println(sum);
	  n=n-1;
   
   
   }
   
   
   
   }






}