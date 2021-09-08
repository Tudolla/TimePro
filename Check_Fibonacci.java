
/**
 *
 * @author Admin
 */
import java.util.*;
import java.math.*;
public class Check_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            long n = sc.nextLong();
            for(int i = 0 ; i<95 ; i++)
            {
                if(Fib(i) == n){ 
                    System.out.println("YES");
                    break;
                }
                else{
                    System.out.println("NO");
                }
            }
            
    
}
 }
    public static long Fib(long n)
    {
         if(n == 1 || n == 2) return 1;
         else return Fib(n-1)+Fib(n-2);
    }
}