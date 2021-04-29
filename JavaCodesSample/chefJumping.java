import java.util.*;
import java.io.*;
import java.lang.*;

class chefJumping{
public static boolean checkInput(long t,long first,long sec,long third){
if(t==first || t==sec || t==third)
return true;
else if(t<first)
return false;


return checkInput(t,third+1,third+3,third+6);




}

public static void main(String[] Args)
{

   Scanner sc=new Scanner(System.in);
   long t=sc.nextInt();
   if(t==0)
   System.out.print("yes");
   else
   {
   long first=1;
   long sec=3;
   long third=6;

   boolean check=checkInput(t,first,sec,third);
   if(check)
   System.out.print("yes");
   else
   System.out.print("no");
   }
   
}

}