import java.util.*;
import java.io.*;
import java.lang.*;

class listOfBooks{

public static void main(String[] Arge)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> array=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
array.add(sc.nextInt());
}
int t=sc.nextInt();
while(t--!=0)
{
System.out.println(array.remove(sc.nextInt()-1));
}
sc.close();

}

}