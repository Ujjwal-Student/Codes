import java.util.*;
import java.lang.*;
import java.io.*;

class MaxKSumm{
   
   public static void main(String[] Args){
   
   
       Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	   int arr[]=new int[n];
	   List<Integer> list=new ArrayList<Integer>();
	   
	   for(int i=0;i<n;i++)
	      arr[i]=sc.nextInt();
	   
	   for(int i=0;i<n;i++)
	   {
	   int sum=0;
	   for(int j=i;j<n;j++)
	   {
	   
	   sum=sum+arr[j];
	   list.add(sum);
	   
	   }
	   }
	   Collections.sort(list);
	   n=list.size()-k;
	   for(int i=0;i<k;i++)
	   System.out.print(list.get(list.size()-1-i)+" ");
   
   
   
   
   
   }




}