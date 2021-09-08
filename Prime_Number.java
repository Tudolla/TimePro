
/**
 *
 * @author Admin
 */
import java.util.*;

public class Prime_Number {
    static boolean Is_prime(int n){
if(n<=1) return false ; 
        for(int i = 2 ; i<n ; i++)
if(n% i == 0) return false ; 
        return true ; 


}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
        int n = sc.nextInt();
        if(Is_prime(n))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    }
}
