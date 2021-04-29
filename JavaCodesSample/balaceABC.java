import java.util.Scanner;
import java.lang.String;
public class balaceABC{


static boolean solve(char[] str)
{
int n=str.length;
if(n==0)
return true;
if(n==1)
return false;
if(str[0]==str[n-1])
return false;
int count_A=0;
int count_B=0;
int count_C=0;
boolean[] ans=new boolean[n];
for(int i=0;i<n;i++)
{
char c=str[i];
if(str[i]=='A')
count_A++;
if(str[i]=='B')
count_B++;
if(str[i]=='C')
count_C++;
}






int count;

char c=str[0];
if(c=='A')
{
//System.out.println("Inside the A block");
if(count_A<count_B)
{
	//System.out.println("Inside the A block"+"       inside the count_A<count_B");
count=0;
if(count_A+count_C!=count_B)
{
	//System.out.println("countA+countB");
return false;
}
else{
for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='A'||c=='C')
count++;
else if(c=='B')
count--;
if(count<0)
return false;
}
if(count>0)
return false;
}
}
else if(count_A<count_C)
{
	//System.out.println("Inside the A block"+"       inside the count_A<count_C");


count=0;
if(count_A+count_B!=count_C)
return false;
else{
for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='A'||c=='B')
count++;
else if(c=='C')
count--;
if(count<0)
return false;
}
if(count>0)
return false;
}




}
else if(count_A !=(count_B+count_C))
{
	//System.out.println("count_A !=(count_B+count_C)");
return false;
}
else if(count_A==(count_B+count_C))
{


count=0;
count=0;
for(int i=0;i<n;i++)
{
	c=str[i];
if(str[i]=='C')
count--;
if(str[i]=='A')
count++;
if(str[i]=='B')
count--;
//System.out.println("Count:    "+count);
if(count < 0)
return false;
}
if(count>0)
{
	//System.out.println("Count:    "+count);
return false;
}







}



}
else if(c=='B')
{



if(count_B<count_A)
{
count=0;
if(count_B+count_C!=count_A)
return false;
else{
for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='B'||c=='C')
count++;
else if(c=='A')
count--;
if(count<0)
return false;
}
if(count>0)
return false;
}
}
else if(count_B<count_C)
{


count=0;
if(count_A+count_B!=count_C)
return false;
else{
for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='A'||c=='B')
count++;
else if(c=='C')
count--;
if(count<0)
return false;
}
if(count>0)
return false;
}




}
else if(count_B !=(count_A+count_C))
{
return false;
}
else if(count_B==(count_A+count_C))
{


count=0;

for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='A'||c=='C')
count--;
else if(c=='B')
count++;
if(count<0)
return false;
}
if(count>0)
return false;







}






}
else if(c=='C')
{




if(count_C<count_B)
{
count=0;
if(count_A+count_C!=count_B)
return false;
else{
for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='A'||c=='C')
count++;
else if(c=='B')
count--;
if(count<0)
return false;
}
if(count>0)
return false;
}
}
else if(count_C<count_A)
{


count=0;
if(count_C+count_B!=count_A)
return false;
else{
for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='C'||c=='B')
count++;
else if(c=='A')
count--;
if(count<0)
return false;
}
if(count>0)
return false;
}




}
else if(count_C !=(count_B+count_A))
{
return false;
}
else if(count_C==(count_B+count_A))
{


count=0;

for(int i=0;i<n;i++)
{
	c=str[i];
if(c=='A'||c=='B')
count--;
else if(c=='C')
count++;
if(count<0)
return false;
}
if(count>0)
return false;







}









}
return true;
}

public static void main(String[] arfgs)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
String str=sc.next();
if(solve(str.toCharArray()))
{
System.out.println("Yes");

}
else
{
System.out.println("No");
}

}

}
}