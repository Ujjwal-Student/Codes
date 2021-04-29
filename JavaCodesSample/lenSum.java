import java.util.*;
import java.io.*;
import java.lang.*;
class lenSum{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int sum=sc.nextInt();
 if(n==1 && sum<=9)
 System.out.print(sum+" "+sum);
 else{

 int min=0;


 int arrMin[]=new int[n];
 int j=1;
 int sum1=sum;
  if(sum<=0 || sum>9*n)
 min=-1;
 else
 for(int i=1;i<=n;)
 {
    if((sum1-j)<=(9*(n-i)))
	{
	arrMin[i-1]=j;
	sum1=sum1-j;
	i++;
	j=0;
	}
	else
	j++;
 }
 

 int max=0;
int arrMax[]=new int[n];
int sum2=sum;
j=9;
 if(sum<=0 || sum>9*n)
 max=-1;
 else
for(int i=1;i<=n;)
{
	if((sum2)>=9)
	{
	arrMax[i-1]=j;
	sum2=sum2-j;
	i++;
	j=9;
	}
	else{
		arrMax[i-1]=sum2;
		break;
	}

}
String str1="";
String str2="";
for(int i=0;i<n;i++)
{
	if(min!=-1)
	str1=str1+arrMin[i];
	if(max!=-1)
	str2=str2+arrMax[i];
}
if(min==-1 && max==-1)
System.out.print("-1 -1");
else if(min==-1)
System.out.print(min+" "+str2);
else if(max==-1)
System.out.print(str1+" "+max);
else
System.out.print(str1+" "+str2);

 }
 }

}