
/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class EdgeClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int arr[][] = new int[vertex+1][vertex+1];
        for(int i = 1 ; i<=vertex ; i++)
        {
            for(int j = 1 ; j<=vertex ; j++)
                arr[i][j] = sc.nextInt();
        }
        for(int i = 1 ; i<=vertex ; i++)
        {
            for(int j = 2 ; j<=vertex ; j++)
                if(arr[i][j] == 1 && i<j)
                    System.out.println("(" + i +"," + j + ")");
        }
    }
    
}
