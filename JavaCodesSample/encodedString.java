import java.util.*;
import java.lang.*;
import java.io.*;

class encodedString{
   
   public static void main(String[] Args)
   {
      Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t>0)
	  {
	    int n=sc.nextInt();
		String str=sc.next();
		int i=0;
		while(i<n)
		{
		  switch(str.substring(i,i+4)){
		  case "0000":
		  System.out.print("a");
		  break;
		  case "0001":
		  System.out.print("b");
		  break;
		  case "0010":
		  System.out.print("c");
		  break;
		  case "0011":
		  System.out.print("d");
		  break;
		  case "0100":
		  System.out.print("e");
		  break;
		  case "0101":
		  System.out.print("f");
		  break;
		  case "0110":
		  System.out.print("g");
		  break;
		  case "0111":
		  System.out.print("h");
		  break;
		  case "1000":
		  System.out.print("i");
		  break;
		  case "1001":
		  System.out.print("j");
		  break;
		  case "1010":
		  System.out.print("k");
		  break;
		  case "1011":
		  System.out.print("l");
		  break;
		  case "1100":
		  System.out.print("m");
		  break;
		  case "1101":
		  System.out.print("n");
		  break;
		  case "1110":
		  System.out.print("o");
		  break;
		  case "1111":
		  System.out.print("p");
		  break;
		  default:
		  break;
		  
		  }
		
		
		   i=i+4;
		
		}
		System.out.println();
		
	    t--;
	  }
   
   }

}