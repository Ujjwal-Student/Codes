import java.util.*;
import java.io.*;
import java.lang.*;

class Code
{
  static void SumofTuplets(int[] a,int[] b,int[] c){
  int sum=0;
     for(int i=0;i<a.length;i++)
	 for(int j=0;j<b.length;j++)
	 for(int k=0;k<c.length;k++)
	 {
	 int f=0;
	    if(a[i]<=b[j] && b[j]>=c[k])
		     f=(a[i]+b[j])*(b[j]+c[k]);
		sum=sum+f;
		    
	 }
	 System.out.println(sum);
	 }
  
  public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  while(n!=0){
    int[] arr1=new int[s.nextInt()];
	int[] arr2=new int[s.nextInt()];
	int[] arr3=new int[s.nextInt()];
	for(int i=0;i<arr1.length;i++)
	{
	arr1[i]=s.nextInt();
	}
	for(int i=0;i<arr2.length;i++)
	{
	arr2[i]=s.nextInt();
	}
	for(int i=0;i<arr3.length;i++)
	{
	arr3[i]=s.nextInt();
	}
     SumofTuplets(arr1,arr2,arr3);
	 n=n-1;
}}}