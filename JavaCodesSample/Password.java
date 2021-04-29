import java.util.*;
import java.io.*;
import java.lang.*;
class Password
{


public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n--!=0)
{
	String s=sc.next();
	int l=s.length();
	if(l<10)
	System.out.println("No");
	else
	{
		int num=0;
		int small_char=0;
		int large_char=0;
		int special=0;
	for(int i=0;i<l;i++)
	{
		char c=s.charAt(i);
		//System.out.print(c);
		if(c>='a' && c<='z')
		{
			small_char=small_char+1;
		}
		if(c>='A' && c<='Z' && i!=0 && i!=l-1)
		{
			large_char=large_char+1;
		}
		if(c>='0' && c<='9' && i!=0 && i!=l-1)
		{
			num=num+1;
		}
		if(c=='#' || c=='@' )
		if(i!=0 && i!=l-1)
		special=special+1;
		if(c=='?' || c=='&')
		if(i!=0 && i!=l-1)
        special=special+1;
		if(c=='%')
		if(i!=0 && i!=l-1)
        special=special+1;
		
		
		
	}
	//System.out.println();
	System.out.print(num+"   "+small_char+"   " +large_char+"   "+special);
	if(num>=1 && small_char>=1 && large_char>=1 && special>=1)
	System.out.println("Yes");
	else 
	{
		System.out.println("No");
	}
	}
		
	


}

}
}