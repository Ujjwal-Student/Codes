import java.util.*;
import java.io.*;
import java.lang.*;

class theRank{

public static void main(String[] Args)
{
 Scanner sc=new Scanner(System.in);
         
        int n=sc.nextInt();

        int[] merchant=new int[n];

        
        merchant[0]=sc.nextInt();
        System.out.println("1");
                
        for(int i=1;i<n;i++)
        {
            int r=0;
            int num=sc.nextInt();
            int j=0;
            while(j<i && merchant[j]>num)
            {
                j++;
                r++;
            }
            for(int k=i-1;k>=j;k--)
            {
                merchant[k+1]=merchant[k];
            }
            merchant[j]=num;
            System.out.println(r+1);
        }
}

}