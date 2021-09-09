
package javaapplication1;


import java.util.*;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=0 || b<=0){
            System.out.println("0");
        
    }
        else{
            System.out.println((a + b)*2 + " " + (a*b));
        }
    
}
} 
