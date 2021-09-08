
/**
 *
 * @author Admin
 */
import java.util.*;
public class Mang_Doi_Xung {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] arr = new int[10000];
        while(test-->0)
        {
            int n = sc.nextInt();
            for(int i = 0 ; i<n ; i++) arr[i] = sc.nextInt();
            int check = 0 ; 
            for(int i = 0 ; i<n/2 ; i++)
            {
                if(arr[i] != arr[n-i-1])
                {
                    check = 1 ; break ;
                }
            }
            if(check == 1 ) System.out.println("NO");
            else System.out.println("YES");
            
        }
    }
}
