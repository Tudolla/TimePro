
/**
 *
 * @author Admin
 */
import java.util.*;
public class Pick_Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++) arr[i] = sc.nextInt();
        int step = 1 ; 
        for(int i = 0 ; i<n-1 ; i++)
        {
            int min_index = i ;
            for(int j = i+1 ; j<n ; j++)
                if(arr[j] < arr[min_index])
                    min_index = j;
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i]=temp;
            System.out.print("Buoc " + step++ + ": ");
            for(int j = 0 ; j<n ; j++)
            {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
    
}
