import java.util.*;
import java.lang.*;
import java.io.*;

class watchingCpl{
  public static void main(String[] Args)
  {
  
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t--!=0){
  int n=sc.nextInt();
  int k=sc.nextInt();
  LinkedList<Integer> list=new LinkedList<Integer>();
  int sum=0;
  for(int i=0;i<n;i++)
  {
	  int j=sc.nextInt();
     list.add(j);
	 
  }
  Collections.sort(list);
  int sum2=0;
  int i=0;
  for(;i<n;i++)
  {
	  int rem=0;
	  if(i<n)
	  rem=list.removeLast();
	  if((sum/k)<1)
	  {
		  sum=sum+rem;
	  }
	  else if((sum2/k)<1)
	  {
		 sum2=sum2+rem;
	  }
      else
	  {
		  
         break;
	  }		 
	  
  }
  
  if((sum/k)>=1 && (sum2/k)>=1)
  System.out.println(i);
  
    if((sum/k)<1 || (sum2/k)<1)
	  System.out.println(-1);
  
  }

}
}