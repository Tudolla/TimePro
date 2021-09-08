
/**
 *
 * @author Admin
 */
import java.util.*;
public class Sort_Chen {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++) arr[i] = sc.nextInt();
        int step = 0 ; 
        System.out.println("Buoc 0: " + arr[0]);
        for (int i = 1; i < n; ++i) {
            System.out.print("Buoc " + i + ": ");
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            
            for(int k = 0 ; k<=i ; k++)
            {
                System.out.print(arr[k] + " ");
                
            }
            System.out.println();
    }
    
}
}
