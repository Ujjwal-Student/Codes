import java.util.*;
import java.io.*;
import java.lang.*;

class endOfCourr{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt()+sc.nextInt();
ArrayList<Integer> array=new ArrayList<Integer>();
while(n--!=0)
{
int num=sc.nextInt();
if(num==-1)
{
int size=array.size()-1;
Collections.sort(array);
System.out.println(array.remove(size));
}
else
{
array.add(num);
}


}
sc.close();
}

}