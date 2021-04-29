import java.util.*;
import java.lang.*;
import java.io.*;

class contestFebQ6Part2{

public static void main(String[] args)
{
int arr=new int[78500];

int b=0;
int count=0;
arr[0]=0;
int j=1;
  for (int m = 2; m <= 1000000; m++)
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
            if (b == 0) 
			{arr[j++]=m;;
			count++;
			}
        }

//System.out.println(count);


Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int x=sc.nextInt();
int y=sc.nextInt();
      if(count>y)
	  {
      if(y>0)
	  {
		if(arr[y] >= x)
		System.out.println("Chef");
		else
		System.out.println("Divyam");
	  }
	  else
	  {
		  System.out.println("Chef");
	  }
	  }
	  else{
		  System.out.println("Chef");
	  }
		


}

}
}