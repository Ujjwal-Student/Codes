import java.util.*;
import java.io.*;
import java.lang.*;

class pairs
{

public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
int add=2;
int max =Integer.MAX_VALUE%1000000;
int count=1;
List<Integer> arr=new ArrayList<Integer>();
for(int i=0;i<max;i++)
{
arr.add(count);
count=count+add;
add++;
}

int n=sc.nextInt();
while(n--!=0)
{
int l=sc.nextInt();
int r=sc.nextInt();
int diff=r-l;


if(diff<0)
System.out.println(0);
else
{

System.out.print(arr.get(diff-1));
}
}

}

}