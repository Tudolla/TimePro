
/**
 *
 * @author Admin
 */
import java.util.*;
import java.math.*;
public class Greatest_Divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
         
        while(test-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
            
        }
    }
    
}
