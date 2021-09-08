
/**
 *
 * @author Admin
 */
import java.util.*;
public class Nice_Number_1 {
    public static String test(String str)
    {
        int n = str.length();
        for(int i = 0 ; i<=n/2 ; i++)
        {
            if(Integer.valueOf(str.charAt(i))%2 == 1 || str.charAt(i) != str.charAt(n-i-1)  )
            {
                return "NO";
            }  
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String str = sc.nextLine();
            System.out.println(test(str));
            
        }
        
    }
    
}
