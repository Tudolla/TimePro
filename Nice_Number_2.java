
/**
 *
 * @author Admin
 */
import java.util.*;
public class Nice_Number_2 {
    public static String test(String str)
    {
        int n = str.length();
        int count = 0; 
        if(str.charAt(0) != '8' || str.charAt(n-1) != '8') return "NO";
        for(int i = 0 ; i<  n/2 ; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1)) {return "NO"; }
            count += 2*Character.getNumericValue(str.charAt(i));
                    
        }
        if(n %2 == 1) count += Character.getNumericValue(str.charAt((n+1)/2));
        if(count % 10 != 0) return"NO";
        return "YES";
        
        
       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String str = sc.nextLine();
            System.out.println(test(str));
            
            
            
        }
        
           
        
    }
    
}
