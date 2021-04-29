import java.util.*;
import java.lang.*;
import java.io.*;

class fairElection{
  static int Swap(int[] arrn,int[] arrm,int sumn,int summ)
{
int count=1;
// System.out.println(sumn+"     "  + summ);
for(int i=0,j=arrm.length-1;i<arrn.length && j>=0;i++,j--)
{
	if(arrn[i]>arrm[j])
	return -1;
sumn=sumn-arrn[i]+arrm[j];
summ=summ-arrm[j]+arrn[i];
if(sumn>summ)
break;
++count;
}
// System.out.println(sumn+"     "  + summ);
if(sumn<summ)
return -1;
return count;

}  
   public static void main(String[] Args)
   {
     Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t>0)
	 {
	    int n=s.nextInt();
		int m=s.nextInt();
		int arrn[] = new int[n];
		int arrm[]=new int[m];
		int sumn=0;
		int summ=0;
		for(int i=0;i<n;i++)
		{
		  arrn[i]=s.nextInt();
		  sumn=sumn+arrn[i];
		}
		for(int i=0;i<m;i++)
		{
		  arrm[i]=s.nextInt();
		  summ=summ+arrm[i];
		}
		Arrays.sort(arrn);
		Arrays.sort(arrm);
		if(sumn<summ)
		{
		System.out.println(Swap(arrn,arrm,sumn,summ));
		}
		else
		{
          System.out.println(0);
		  }
		
	 t--;
	 
	 }
   
   
   }

}