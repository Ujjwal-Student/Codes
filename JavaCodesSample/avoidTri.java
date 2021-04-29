import java.util.Scanner;
import java.lang.String;

class avoidTri{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int n=sc.nextInt();
String s=sc.next();
String[] str=s.split("trygub",0);
int len=str.length;
for(int i=0;i<len;i++)
{
System.out.println(str[i]+"\n");
}


}

}

}