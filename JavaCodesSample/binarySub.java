/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class binarySub
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		        int n=sc.nextInt();
		        String s=sc.next();
		        System.out.println(s);
		        int ini=0;
		        int last=0;
		        int count=0;
		        for(int i=0;i<n;i++)
		        {
		                char c=s.charAt(i);
		                count=0;
		                int j=i;
		                if(s.charAt(i)==c)
		                for(j=i;j<n;j++)
		                {
		                        if(c!=s.charAt(j))
		                        {
		                                
		                                break;
		                                
		                        }
		                        count++;
		                }
		                if(count>=last-ini)
		                {
		                        ini=i;
		                        last=j;
		                }
		        }
				
				
		        //for(int i=ini;i<last;i++)
		        //System.out.print(s.charAt(i)+"");
		        //System.out.println("\n");
		       boolean flag=true;
		       for(int i=0;i<n-1;i++)
		       {
		               if(s.charAt(i)>s.charAt(i+1))
		               {
		                       flag=false;
		                        break;
		               }
		       }
		       if(flag)
		       {
		               System.out.println("Output is : 0");
		       }
		     else{
		             int count_1=0;
		             int count_0=0;
		            for(int i=0;i<ini;i++)
		            {
		                   if(s.charAt(i)=='1')
		                   count_1++;
		                   else
		                   count_0++;
		            }
					int out=0;
		            if(s.charAt(init)=='1')
					{
		            if(count_0>=count_1)
					{
						out=out+count_1;
					}
					else{
						
					}
					}
		            else
		            {
					      
		                    count_0=count_0+last-ini-1;
							if(count_0>=count_1)
							{
								out=out+count_1;
							}
							else
							{
								
							}
		            }
		           // System.out.println(count_1 +"     "+count_0);
		           
		           
		           
		          // System.out.println(out);
		          int count_SecSet_0=0;
		          int count_SecSet_1=0;
				  if(last!=n)
				  {
		          if(s.charAt(last-1)=='0')
		          {
		              for(int i=last;i<n;i++)
		              {
		                    if(s.charAt(i)=='1')
		                    {
		                            count_SecSet_1++;
		                    }
		                    else
		                    {
		                            count_SecSet_0++;
		                    }
		              }
		              if(count_SecSet_0>=count_SecSet_1)
		              {
		                      System.out.println("Output is : "+(out+count_SecSet_1));
		              }
		              else{
		                       System.out.println("Output is : "+(out+count_SecSet_0));
		              }
		          }
		          else
		          {
		                System.out.println("Calculateing bro wait");  
		          }
				  }
				  else{
					  System.out.println("Output is : "+out);
				  }
		          
		           
		           
		     }
		}
	}
}
