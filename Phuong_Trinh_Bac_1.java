
/**
 *
 * @author Admin
 */
import java.util.*;
public class Phuong_Trinh_Bac_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b == 0)
            System.out.println("VSN");
        else if(a == 0 && b != 0)
            System.out.println("VN");
        else
            System.out.printf("%.2f", (float)-b/a);
    }
    
}
