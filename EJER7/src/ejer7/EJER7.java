/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer7;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 0, max = 0, min = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num = input.nextInt();
        
        min = num;
        while(num >= 0){
            if(num > max){
                max = num;
        }
            if(num < min){
            max = min;
            
        }    
            System.out.println("Ingrese otro número:");
            num = input.nextInt();
        }
        System.out.println("El valor minimo es: " + min);
        System.out.println("El valor máximo es: " + max);
    
    }
}
