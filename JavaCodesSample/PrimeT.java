import java.io.*; 
import java.util.*; 
  
class PrimeT { 
      
// function to detect prime number 
// here we have used sieve method 
// https://www.geeksforgeeks.org/sieve-of-eratosthenes/ 
// to detect prime number 
    static void sieve(int n, boolean prime[]) 
    { 
        for (int p = 2; p * p <= n; p++) { 
      
            // If prime[p] is not changed, 
            //then it is a prime 
            if (prime[p] == true) { 
      
                // Update all multiples of p 
                for (int i = p * 2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
    } 
      
    // function to print prime triplets 
    static void printPrimeTriplets(int n) 
    { 
        // Finding all primes from 1 to n 
        boolean prime[]=new boolean[n + 1]; 
        Arrays.fill(prime,true); 
        sieve(n, prime); 
          
        System.out.println("The prime triplets"+ 
               				" from 1 to " + n + "are :"); 
          int count=0;
        for (int i = 2; i <= n-6; ++i) { 
      
            // triplets of form (p, p+2, p+6) 
            if (prime[i] && prime[i + 2] && prime[i + 6]) 
			{
               // System.out.println( i + " " + (i + 2) +  
                        //            " " + (i + 6)); 
						if((i+i+2)==(i+6))
									count++;
			}
      
            // triplets of form (p, p+4, p+6) 
            else if (prime[i] && prime[i + 4] &&  
                     prime[i + 6]) 
					 {
                   
                //System.out.println(i + " " + (i + 4) + 
                          //         " " + (i + 6));
						  if((i+i+4)==(i+6))
								   count++;
					 }								   
        }
System.out.println(count);		
    } 
      
    public static void main(String args[]) 
    { 
        int n = 25; 
        printPrimeTriplets(n); 
    } 
} 