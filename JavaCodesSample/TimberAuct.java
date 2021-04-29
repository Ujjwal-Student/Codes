import java.util.*;
import java.io.*;
import java.lang.*;


class TimberAuct{

public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[][] tree=new int[n][m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
tree[i][j]=sc.nextInt();
}
}
int t=sc.nextInt();
while(t--!=0)
{
	int sum=0;
int x1=sc.nextInt()-1;
int y1=sc.nextInt()-1;
int x2=sc.nextInt();
int y2=sc.nextInt();
for(int i=x1;i<x2;i++)
{
for(int j=y1;j<y2;j++)
{
sum=sum+tree[i][j];
}
}
System.out.println(sum);

}





}
}