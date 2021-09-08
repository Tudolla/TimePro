
/**
 *
 * @author Admin
 */
import java.util.*;
public class Find_Fibonaci {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long Fib [] = new long[100];
        Fib[0]= 0 ;
        Fib[1]= 1 ; 
        Fib[2]= 1 ;
        for(int i = 3 ; i<93 ; i++)
        Fib[i]= Fib[i-1]+Fib[i-2];
        
        while(test-- >0){
            int n = sc.nextInt();
            System.out.println(Fib[n]);
        }
    }
    
}
