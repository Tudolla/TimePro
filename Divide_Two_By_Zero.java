
/**
 *
 * @author Admin
 */
import java.util.*;
public class Divide_Two_By_Zero {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            int count = 0 ; 
            if(n % 2 == 0) count++ ; // tang len 1 , vs 8%2 = 4 >> count = 1;
            for(int i = 2 ; i<=Math.sqrt(n);++i)
            {
                if(n%i == 0)
                {
                    if(i%2 == 0) count++;
                    if(n/i !=i && (n/i)%2 == 0) count++;
                }
            }
            System.out.println(count);
            
        }
    }
    
}
