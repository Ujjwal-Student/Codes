
import java.util.*;
import java.lang.*;
import java.io.*;

class contestFebQ5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
int n=sc.nextInt();
String s=sc.nextLine();
s=sc.nextLine();
String[] question1 = s.split(" ");
ArrayList<String> list = new ArrayList<String>(Arrays.asList(question1));




//LinkedHashSet<String> set=new LinkedHashSet<String>();
int count=0;
for(int i=0;i<n;i++)
{
	 String str1=list.get(i);
	 int j=i+1;
	for(;j<n;j++)
	{

		String str2=list.get(j);
		if(str1.charAt(0)==str2.charAt(0));
		else{
			String rep1=""+str1.charAt(0);
			String rep2=""+str2.charAt(0);

			String str3=str1.replaceFirst(rep1,rep2);
			String str4=str2.replaceFirst(rep2,rep1);
			if(!list.contains(str3) && !list.contains(str4))
			{
				//String str5=str3+" "+str4;
				//set.add(str5);
				count++;
			}

		}
		
	}
}

System.out.println(2*count);

}
}

}