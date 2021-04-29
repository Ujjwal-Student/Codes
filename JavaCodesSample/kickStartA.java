import java.util.*;
import java.lang.*;

public class kickStartA{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        for(int j=1;j<=t;j++)
        {
           int n=sc.nextInt();
           int k=sc.nextInt();
           char str[]=sc.next().toCharArray();
           int count=0;
           for(int i=0;i<n/2;i++)
           {
               if(str[i]!=str[n-i-1])
               {
                   count++;
               }

           }
           System.out.println(count);
           if(count>=k)
           {
               System.out.println("Case #"+j+": "+(count-k));
           }
           else{
            System.out.println("Case #"+j+": "+(k-count));
           }
        }
    }
}