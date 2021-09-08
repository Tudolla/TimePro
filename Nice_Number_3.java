import java.util.*;
public class Nice_Number_3 {
    public static String Ok(String str)
    {
        int n = str.length();
        for(int i = 0 ; i<= n/2 ; i++){
            if(str.charAt(i) != str.charAt(n-i-1) || !prime(Character.getNumericValue(str.charAt(i))) || !prime(Character.getNumericValue(str.charAt(n-i-1))))
            
            
                return "NO";
             
        }
       return "YES"; 
    }
    public static boolean prime(int n)
    {
        if(n == 3 || n == 5 || n == 7 || n == 2) return true ; 
        return false ; 
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String str = sc.nextLine();
            System.out.println(Ok(str));
        }
    }
   
    
}
