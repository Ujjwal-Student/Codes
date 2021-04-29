import java.util.*;
import java.lang.*;
import java.io.*;

class contestFebQ6{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int num=78498;
while(t--!=0)
{
int x=sc.nextInt();
int y=sc.nextInt();
int count=0;
int b=0;
boolean flag=true;
        if(num<y)
		System.out.println("Chef");
		else{
        for (int m = 2; m <= x; m++)
        {
            for (int i = 2; i <= Math.sqrt(m); i++)
            {
                b = 0;
                if (m % i == 0)
                {
                    b = 1;
                    break;
                }
            }
            if (b == 0) count++;
			if(count>y)
			{
			flag=false;
			break;
			}
        }
		if(count<=y && flag)
		System.out.println("Chef");
		else
		System.out.println("Divyam");
		}
		


}

}
}