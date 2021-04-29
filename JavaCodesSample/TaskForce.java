import java.util.*;
import java.io.*;
import java.lang.*;

class TaskForce{
public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int k=sc.nextInt();
LinkedList<Integer> list1=new LinkedList<Integer>();
LinkedList<Integer> list2=new LinkedList<Integer>();
LinkedList<Integer> list3=new LinkedList<Integer>();
int count=1;
list1.add(sc.nextInt());
list2.add(sc.nextInt());
for(int i=1;i<m;i++)
{
int num1=sc.nextInt();

if(list1.contains(num1))
{
count++;
}
else
{
list1.add(num1);
list3.add(count);
count=1;
}




list2.add(sc.nextInt());
}

System.out.println(list1+"\n"+list3);

}
}