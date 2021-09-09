/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Phuong_trinh_bac_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double res = sc.nextDouble();
        if(a == 0 && b == 0){
            System.out.println("VSN");
    }
        else if(a == 0 && b != 0){
            System.out.println("VN");
        }
        else{
            res = (double)b/a;
            System.out.printf("%.2f",(-res));
        }
    
}
}
