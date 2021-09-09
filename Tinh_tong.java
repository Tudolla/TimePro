/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.*;
public class Tinh_tong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int n = sc.nextInt();
            int sum = 0 ; 
            for(int i = 1 ; i<=n ; i++)
            {
                sum = sum+i ;
            }
            System.out.println(sum);
            
        }
    }
    
}
