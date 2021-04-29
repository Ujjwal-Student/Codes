import java.util.*;
import java.lang.*;
import java.io.*;

class codeC{
	 static int find(int arr[], int n, int k) 
    { 
          
        // Check if 'k' is valid 
        if (k > n) 
            return -1; 
      
        // Compute sum of first 'k' elements 
        int sum = arr[0]; 
        for (int i = 1; i < k; i++) 
            sum += arr[i]; 
      
        int max_sum = sum, max_end = k-1; 
      
        // Compute sum of remaining subarrays 
        for (int i = k; i < n; i++) 
        { 
            sum = sum + arr[i] - arr[i-k]; 
            if (sum > max_sum) 
            { 
                max_sum = sum; 
                max_end = i; 
            } 
        } 
      
        // Return starting index 
		//System.out.println("Sum Sum"+max_sum);
        return max_end - k + 1; 
    } 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

// write your code here
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int start =find(arr,n,k);
int med;
float value;
if(k%2==0)
{
	med=arr[start+(k/2)-1]+arr[start+(k/2)];
	value=med/2;
}
else
{
	med=arr[start+(k/2)];
	value=(float) med/2;
}
	
System.out.println(value+"    " +Math.round(value)+"    "+med);


}
}