
/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class NoName {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long Uoc = Min(a,b);
            long Boi = (a/Min(a,b)) *b;
            System.out.println(Boi + " " + Uoc);
        }
        sc.close();
    }
        public static long Min(int a , int b){
        
            if(b == 0) return a ; 
            return Min(b , a%b);
        }
        
    }


