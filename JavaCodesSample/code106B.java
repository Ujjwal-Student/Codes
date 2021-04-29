import java.util.*;
import java.lang.*;

public class code106B{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            char str[]=sc.next().toCharArray();
            int n=str.length;
            int j=n;
            boolean flag=true;
            for(int i=0;i<n;i++)
            {
               if(str[i]=='1')
               {
                   j=i;
                   break;
               }
            }
           //System.out.println(j);
            for(;j<n-1;j=j+2)
            {
                if((str[j]=='1' || str[j]=='0') && str[j+1]=='0')
                {
                   // System.out.print(str[j]);
                    str[j]='0';
                }
                else if(str[j]=='1' && str[j+1]=='1')
                {
                    break;
                }
            }
            while(j<n)
            {
                //System.out.print(str[j]);
                str[j]='1';
                j=j+2;
            }
            for(int i=1;i<n;i++)
            {
                //System.out.print(str[i-1]+" ");
                if(str[i-1]>str[i])
                {
                    //System.out.print(str[i]+" ");
                    flag=false;
                    break;
                }
               
            }
             if(flag)
             {
                 System.out.println("Yes");
             }
             else
             {
                 System.out.println("No");
             }
            //int arr[][]=new int[2][n];
            /*

5
10101011011
0000
11111
110
1100





            int count=k1/2+k2/2;
            k1=k1%2;
            k2=k2%2;
            if(k1!=k2)
            {
                System.out.println("No");
            }
            else{
                count+=k1;
                if(count!=w && w!=0)
                {
                    System.out.println("No");
                }
                else
                {
                    int countB=b1/2+b2/2;
                    b1=b1%2;
                    b2=b2%2;
                    countB+=b1;
                    if(countB!=b && b!=0)
                    {
                        System.out.println("No");

                    }
                    else{
                        System.out.println("Yes");
                    }
                }
                
            }



if(w+b<n)
{
    System.out.println("Yes");

}
else if(w+b == n)
{
  int count=Math.min(k1,k2);
  int min=Math.min(k1,k2);
  count+=(n-min)/2;
  count+=Math.min(b1,b2);
  min=Math.min(b1,b2);;
  count+=(n-min)/2;
  if(count>= w+b)
  {
      System.out.println("Yes");
  }
  else{
      System.out.println("No");
  }

}
else
{
    System.out.println("No");
}
*/
            /*
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            */
        }
    }
}