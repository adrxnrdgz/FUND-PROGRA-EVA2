/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer3;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nume;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        nume = input.nextInt();
        
        int suma = 0;
        for (int i = 0; i <= nume; i++) {
            suma = suma + i;  
        }
        System.out.println("La sumatoria de " + nume + " es: " + suma);
        
    }
    
}
