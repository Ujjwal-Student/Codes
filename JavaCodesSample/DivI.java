import java.util.Scanner;

class DivI{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
long p=sc.nextLong();
long q=sc.nextLong();
if(p<q)
{
System.out.println(p);
}
else if(p==q)
{
System.out.println(p/2);
}
else{
if(p%q!=0)
{
System.out.println(p);

}
else{
long num=1;
for(int i=2;i<1000000000;i++)
{
if(p%i==0)
{
num=p/i;
if(num%q == 0)
{
}
else{
	break;
}
}
}
System.out.println(num);
}


}

}

}
}