import java.util.*;
import java.io.*;
import java.lang.*;

class Catapillar
{
public static void main(String[] ARgs)
{
Scanner sc=new Scanner(System.in);
long n=sc.nextInt();
int t=sc.nextInt();
int N=(int)n;
int arr[]=new int[N+1];
int k=t;
while(k--!=0)
{
int num = sc.nextInt();
			for(int i = 1; i <= n; i+=num) {
				arr[i] = 1;
			}


}
int count=0;
for(int j = 1; j <= n; j++) {
			if (arr[j] == 0)
				count++;
		}
		System.out.println(count);

}

}