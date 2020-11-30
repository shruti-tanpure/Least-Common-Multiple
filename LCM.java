import java.util.Scanner;
public class LCM
{
    public static void main(String args[])
    {
        int a=0;
        int b=0;
        int gcd=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        System.out.println(common_multiple(a,b));
    }
    
    public static long euclid_gcd(int a, int b)
    { 
         int c=0;
         if (b == 0) 
         {   
             return a; 
         }
         c=a%b; 
         return euclid_gcd(b, c); 
    }
    
    public static long common_multiple(int a,int b)
    {
         long gcd=0;
         long lcm =0;
         long multiply = 0;
         if(a>b)
             gcd= euclid_gcd(a,b);
         else
             gcd = euclid_gcd(b,a);

         multiply=(long)a* (long)b;
         lcm = multiply/gcd; 
         return lcm;
    }
}
