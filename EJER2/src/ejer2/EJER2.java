/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nume1;
        int nume2;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        nume1 = input.nextInt();
        System.out.println("Introduce el segundo número:");
        nume2 = input.nextInt();
        
        for (int i = nume1; i <= nume2; i++) {
            if((i % 2) != 0)
                continue;
            System.out.print(i + " - ");
        }
        
        
        
    }
    
}
