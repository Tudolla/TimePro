
import java.util.*;
public class Prime_Factor {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int cases = 1 ;
        while(test-->0){
            long n = sc.nextLong();
            
            System.out.print("Test " + cases + ": ");
            for(int i = 2 ; i<=Math.sqrt(n) ; i++)
            {
                int count = 0 ; 
                while(n%i == 0)
                {
                    n = n/i ; 
                    count++ ; 
                }
                if(count > 0)
                    System.out.print(i + "(" + count + ") ");
            }
            if(n > 2) System.out.println( n + "(" + 1 + ")");
            cases++ ;
            System.out.println();
            
            
        }
        sc.close();
    }
}
