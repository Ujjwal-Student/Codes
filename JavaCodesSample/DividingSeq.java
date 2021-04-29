import java.util.*;
import java.io.*;
import java.lang.*;

class DividingSeq{
public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new  int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
LinkedList<Integer> list=new LinkedList<Integer>();
int size=0;
for(int i=0;i<n;i++)
{
int num=arr[i];
LinkedList<Integer> list1=new LinkedList<Integer>();
list1.add(num);
 for(int j=i+1;j<n;j++)
 {
 if(arr[j]%num==0)
 {
 list1.add(arr[j]);
 num=arr[j];
 
 }
 }
 if(list1.size()>size)
 {
 size=list1.size();
 list.clear();
 list.addAll(list1);
 
 }
 
 
 
 
}
System.out.println(list);
System.out.print(size);

}
}