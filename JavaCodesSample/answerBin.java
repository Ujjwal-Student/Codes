/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class answerBin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n = sc.nextInt();
            String s = sc.next();

            int[] zero = new int[s.length()];
            int[] one = new int[s.length()];

            int x = 0;

            for(int i=0;i<s.length();i++){
                char curr = s.charAt(i);
                if(curr=='0'){
                    zero[i] = x;
                }else{
                    x++;
                    zero[i] = x;
                }

            }

            int y = 0;
            for(int i=s.length()-1;i>=0;i--){
                char curr = s.charAt(i);
                if(curr=='1'){
                    one[i] = y;
                }else{
                    y++;
                    one[i] = y;
                }
            }
for(int i=0;i<s.length();i++)
{
	System.out.println("values :   "+zero[i]+"    "+one[i]);
}

            int ans = zero.length;
            for(int i=0;i<zero.length;i++) {
                if(ans > zero[i] + one[i]) ans = zero[i] + one[i];
            }


            System.out.println(ans-1);
        }
	}
}
