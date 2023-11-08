/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer5;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x, n, resu = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la base:");
        x = input.nextInt();
        
        System.out.println("Ingrese el exponente:");
        n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            resu = resu * x;   
        }
        System.out.println("El resultado de la potencia es " + resu);
        
    }
}