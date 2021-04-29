
import java.util.*;
import java.lang.*;
import java.io.*;

class contestFebQ3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
while(t--!=0)
{
String time=sc.nextLine();
//System.out.println(time+"    "+time.length());

String hour=""+time.charAt(0)+time.charAt(1);
String minutes=""+time.charAt(3)+time.charAt(4);

char init=time.charAt(6);
int h=Integer.parseInt(hour);
int min=Integer.parseInt(minutes);







if(init=='A' && h>=12)
{
	h -= 12;
}
else if(init=='P' && h<12)
{
	h=h+12;
}
int time_bet=h*60+min;
//System.out.println("tine_bet"  +"     " +time_bet);
int n=sc.nextInt();
sc.nextLine();
while(n--!=0)
{
String timeLimit=sc.nextLine();
//System.out.println(timeLimit.length());
String initial_hour=""+timeLimit.charAt(0)+timeLimit.charAt(1);
String initial_minutes=""+timeLimit.charAt(3)+timeLimit.charAt(4);
String final_hour=""+timeLimit.charAt(9)+timeLimit.charAt(10);
String final_minutes=""+timeLimit.charAt(12)+timeLimit.charAt(13);
char ini=timeLimit.charAt(6);
char fin=timeLimit.charAt(15);
int ini_h=Integer.parseInt(initial_hour);
int ini_min=Integer.parseInt(initial_minutes);
int final_h=Integer.parseInt(final_hour);
int final_min=Integer.parseInt(final_minutes);
//System.out.println("initial hours and minutes"+ini_h+":"+ini_min+"\n"+"final hours and minutes"+final_h+":"+final_min+"\n\n\n"+ini + fin+"\n\n\n");

if(ini=='A' && ini_h>=12)
{
	ini_h -= 12;
}
else if(ini=='P' && ini_h<12)
{
	ini_h=ini_h+12;
}
if(fin=='A' && final_h>=12)
{
	final_h -= 12;
}
else if(fin=='P' && final_h<12)
{
	final_h=final_h+12;
}
//System.out.println("initial hours and minutes"+ini_h+":"+ini_min+"\n"+"final hours and minutes"+final_h+":"+final_min+"\n\n\n"+ini + fin+"\n\n\n");

int full_hour_ini=ini_h*60+ini_min;
int full_hour_fin=final_h*60+final_min;
//System.out.println("between    "+full_hour_ini+"        "+full_hour_fin+"\n\n\n");
if(time_bet<=full_hour_fin && full_hour_ini<=time_bet)
System.out.print(1);
else
System.out.print(0);
}
System.out.println();
}
}

}