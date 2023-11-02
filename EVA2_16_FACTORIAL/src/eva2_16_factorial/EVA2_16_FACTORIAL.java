/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        num = input.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " - ");
            factorial = factorial * i;
            
        
        }
        System.out.println("");
        System.out.println("Factorial de " + num + " es " + factorial);
        for (int i = num; i >= 1; i--) {
            System.out.print(i + " - ");
          
        }
        
        
        
    }
    
}
