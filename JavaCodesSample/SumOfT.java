
import java.lang.Math;
import java.util.*;

public class SumOfT{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
boolean flag=false;
int cnt2021 = n % 2020;
    int cnt2020 = (n - cnt2021) / 2020 - cnt2021;
    if (cnt2020 >= 0 && 2020 * cnt2020 + 2021 * cnt2021 == n) {
     System.out.println("Yes");
    } else {
      System.out.println("No");

}
}
}
}
