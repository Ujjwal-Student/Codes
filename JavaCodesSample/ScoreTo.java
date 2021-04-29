import java.io.*;
import java.util.Scanner;
class ScoreTo{
	
	
public static void main(String[] args){
 PrintWriter out=new PrintWriter(System.out);

Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[k];
for(int i=0;i<k;i++)
{
arr[i]=sc.nextInt();

}

while(n--!=0)
{
String str=sc.next();
int sum=0;
for(int i=0;i<k;i++)
{
if(str.charAt(i)=='1')
{
sum=sum+arr[i];
}
}
String s=""+sum;
try
{
out.println(sum);
}
catch(Exception e)
{
}
}
}
}


}