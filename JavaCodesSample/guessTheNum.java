import java.util.*;
import java.lang.*;
import java.io.*;
class guessTheNum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            for(int i=0;i<10000;i++)
            {
               System.out.println(i*i);
               int num=sc.nextInt();
               if(num==1)
               break;
               else if(num==-1)
               exit();
                        
            }
            
            
        }
    }
}