import java.util.Scanner;
import java.lang.Math;
class div2College4{
	
	
	static long calculateABC(int n,int e,int h,int a,int b,int c)
	{
		int a1=e/2;
		e-=a1*2;
		
		long price=(long) a1*a;
		int b1=h/3;
		h-=b1*3;
		price+=(long) b1*b;
		
		
		
		int c1=Math.min(e,h);
		if( a1+b1 < n )
		{
			if((a1+b1+c1)>=n)
			c1=n-a1-b1;
		}
		price+=(long) c1*c;
		if((a1+b1+c1)>=n)
		return price;
		return Long.MAX_VALUE;
	}
	static long calculateACB(int n,int e,int h,int a,int b,int c)
	{
		int a1=e/2;
		e-=a1*2;
		long price=(long) a1*a;
		int c1=Math.min(e,h);
		h-=c1;
		e-=c1;
		price+=(long) c1*c;
		
		
		
		int b1=h/3;
		if( a1+c1 < n )
		{
			if((a1+b1+c1)>=n)
			b1=n-a1-c1;
		}
		
		
		price+=(long) b1*b;
		if((a1+b1+c1)>=n)
		return price;
		return Long.MAX_VALUE;
		
	}
	static long calculateBAC(int n,int e,int h,int a,int b,int c)
	{
		int b1=h/3;
		h-=b1*3;
		long price=(long) b1*b;
		
		int a1=e/2;
		e-=a1*2;
		price+=(long) a1*a;
		
		
		
		
		int c1=Math.min(e,h);
		if( a1+b1 < n )
		{
			if((a1+b1+c1)>=n)
			c1=n-a1-b1;
		}
		price+=(long) c1*c;
		
		if((a1+b1+c1)>=n)
		return price;
		return Long.MAX_VALUE;
	}
	static long calculateBCA(int n,int e,int h,int a,int b,int c)
	{
		int b1=h/3;
		h-=b1*3;
		long price=(long) b1*b;
		
		int c1=Math.min(e,h);
		h-=c1;
		e-=c1;
		price+=(long) c1*c;
		
		
		
		
		
		int a1=e/2;
		if( c1+b1 < n )
		{
			if((a1+b1+c1)>n)
			a1=n-c1-b1;
		}
		e-=a1*2;
		price+=(long) a1*a;
		
		if((a1+b1+c1)>=n)
		return price;
		return Long.MAX_VALUE;
		
	}
	static long calculateCBA(int n,int e,int h,int a,int b,int c)
	{
		int c1=Math.min(e,h);
		h-=c1;
		e-=c1;
		long price =(long) c1*c;
		int b1=h/3;
		h-=b1*3;
		price+=(long) b1*b;
		
		
		
		
		
		int a1=e/2;
		if( c1+b1 < n )
		{
			if((a1+b1+c1)>n)
			a1=n-c1-b1;
		}
		e-=a1*2;
		price+=(long) a1*a;
		
		if((a1+b1+c1)>=n)
		return price;
		return Long.MAX_VALUE;
		
	}
	static long calculateCAB(int n,int e,int h,int a,int b,int c)
	{
		
		int c1=Math.min(e,h);
		h-=c1;
		e-=c1;
		long price =(long) c1*c;
		
		int a1=e/2;
		e-=a1*2;
		price+=(long) a1*a;
		
		
		
		
		int b1=h/3;
		
		if( a1+c1 < n )
		{
			if((a1+b1+c1)>n)
			b1=n-a1-c1;
		}
		
		h-=b1*3;
		price+=(long) b1*b;
		
		
		if((a1+b1+c1)>=n)
		return price;
		return Long.MAX_VALUE;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    static long calculateA(int n,int e,int a){
        int ans=e/2;
        if(n<=ans)
        {
            return (long) a*n;
        }
        return Long.MAX_VALUE;

    }
     static long calculateB(int n,int h,int b){
        int ans=h/3;
        if(n<=ans)
        {
            return (long) b*n;
        }
        return Long.MAX_VALUE;

    }
      static long calculateC(int n,int e,int h,int c){
        int ans=Math.min(e,h);
        if(n<=ans)
        {
            return (long) c*n;
        }
        return Long.MAX_VALUE;

    }
      static long calculateAB(int n,int e,int h,int a,int b){
        long price;
        int p=e/2;
        long price1=(long) p*a;
        int p1=h/3;
        if(p1+p>=n)
        {
            p1=0;
            if(n>p)
            p1=n-p;
            price=price1 + (long) p1*b;
        }
        else
        {
            price=Long.MAX_VALUE;
        }
        p=h/3;
        price1=(long) p*b;
        p1=e/2;
        long price2;
        if(p1+p>=n)
        {
            p1=0;
            if(n>p)
            p1=n-p;
            price2=price1 + (long) p1*a;
        }
        else
        {
            price2=Long.MAX_VALUE;
        }

        return (long) Math.min(price,price2);

    }



    static long calculateBC(int n,int e,int h,int b,int c){
        long price;
        int p=Math.min(e,h);
        long price1=(long) p*c;
        int p1=(h-p)/3;
        if(p1+p>=n)
        {
            p1=0;
            if(n>p)
            p1=n-p;
            price=price1 + (long) p1*b;
        }
        else
        {
            price=Long.MAX_VALUE;
        }
        p=h/3;
        price1=(long) p*b;
        p1=Math.min(h-(p*3),e);
       // System.out.println("p1"+p1);
        long price2;
        if(p1+p>=n)
        {
            p1=0;
            if(n>p)
            p1=n-p;
            price2=price1 + (long) p1*c;
        }
        else
        {
            price2=Long.MAX_VALUE;
        }

        return (long) Math.min(price,price2);

    }
    static long calculateCA(int n,int e,int h,int a,int c){
        long price;
        int p=Math.min(e,h);
        long price1=(long) p*c;
        int p1=(e-p)/2;
        if(p1+p>=n)
        {
            p1=0;
            if(n>p)
            p1=n-p;
            price=price1 + (long) p1*a;
        }
        else
        {
            price=Long.MAX_VALUE;
        }
        p=e/2;
        price1=(long) p*a;
        p1=Math.min(e-(p*2),h);
        //System.out.println("p1"+p1);
        long price2;
        if(p1+p>=n)
        {
            p1=0;
            if(n>p)
            p1=n-p;
            price2=price1 + (long) p1*c;
        }
        else
        {
            price2=Long.MAX_VALUE;
        }

        return (long) Math.min(price,price2);

    }

    static int findSmall(int[] arr)
    {
            int small=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<3;i++)
            {
                if(arr[i]<=small && arr[i]!=-1)
                {
                        index=i;
                        small=arr[i];
                }
            }
            if(arr[0]==arr[1] && arr[1]==arr[2])
            return 2;
            if(arr[0]==arr[1] && arr[2]==-1)
            return 0;
            return index;
    }




public static void main(String[] args)
{


Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
    int n=sc.nextInt(),e=sc.nextInt(),h=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
    long ans=Long.MAX_VALUE;
    ans=(long) Math.min(calculateA(n,e,a),ans);

    ans=(long) Math.min(calculateB(n,h,b),ans);

    ans=(long) Math.min(calculateC(n,e,h,c),ans);

    ans=(long) Math.min(calculateAB(n,e,h,a,b),ans);
    ans=(long) Math.min(calculateBC(n,e,h,b,c),ans);
    ans=(long) Math.min(calculateCA(n,e,h,a,c),ans);
   

/*
int sum=0;
		     long price=0;
 int[] arr=new int[3];
		     arr[0]=a;
             arr[1]=b;
             arr[2]=c;
             for(int i=0;i<3;i++)
		     {
		     int index=findSmall(arr);
		     if(index==0)
		     {
		           
		          if(e>=2)
		          {
		                  
		                 int a1=e/2;
		                 e-=(a1*2);
		                 if((sum+a1)>n)
		                 {
		                        int b1=n-sum; 
		                        a1=b1;
		                 }
		                 sum+=a1;
		                 price+=(long) a1*arr[index];
		                 
		                
		          }
		          if(sum>=n)
		                 break;
		     }
		     else if(index==1)
		     {
		           if(h>=3) 
		           {
		                 int a1=h/3;
		                 h-=(a1*3);
		                 
		                 
		                 if((sum+a1)>n)
		                 {
		                        int b1=n-sum; 
		                        a1=b1;
		                 }
		                 
		                 sum+=a1;
		                 price+=(long) a1*arr[index];   
		           }
		           if(sum>=n)
		                 break;
		     }
		     else if(index==2)
		     {
		           if(h>=1 && e>=1) 
		           {
		                 int a1=Math.min(h,e);
		                 h-=a1;
		                 e-=a1;
		                 
		                 if((sum+a1)>n)
		                 {
		                        int b1=n-sum; 
		                        a1=b1;
		                 }
		                 
		                 sum+=a1;
		                 price+=(long) a1*arr[index];   
		           }
		           if(sum>=n)
		                 break;
		     }
             arr[index]=-1;
		     }


















    
     if(sum>=n)
    ans=(long) Math.min(price,ans);
	*/
	ans=(long) Math.min(calculateABC(n,e,h,a,b,c),ans);
	ans=(long) Math.min(calculateACB(n,e,h,a,b,c),ans);
	ans=(long) Math.min(calculateBAC(n,e,h,a,b,c),ans);
	ans=(long) Math.min(calculateBCA(n,e,h,a,b,c),ans);
	ans=(long) Math.min(calculateCAB(n,e,h,a,b,c),ans);
	ans=(long) Math.min(calculateCBA(n,e,h,a,b,c),ans);
	
	
	
    if(ans != Long.MAX_VALUE)
    System.out.println(ans);
    else
    System.out.println(-1);

    
}

}
}