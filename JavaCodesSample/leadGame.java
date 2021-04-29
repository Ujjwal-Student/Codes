import java.util.*;
import java.lang.*;
import java.io.*;

class leadGame
{


public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
t=t-1;
int p1=sc.nextInt();
int p2=sc.nextInt();
int max;
int player;
if(p1>=p2)
{
max=p1-p2;
player=1;
}
else
{
max=p2-p1;
player=2;
}


while(t--!=0)
{
p1=p1+sc.nextInt();
p2=p2+sc.nextInt();
if(p1>=p2 && max<p1-p2)
{
max=p1-p2;
player=1;
}
else if(p2>p1 && max<p2-p1)
{
max=p2-p1;
player=2;
}

}
if(player==1)
{
System.out.println(player+" "+max);
}
else
{
System.out.println(player+" "+max);
}

}

}