/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        int valor, residuo;
        
        System.out.println("Introduce el valor a evaluar");
        valor = input.nextInt();
        
        residuo = valor % 2; //Módulo, calcula el residuo.
        
        if(residuo == 0) //Verdad --> El número es par
            System.out.println("El número es par.");
        else 
            System.out.println("EL número es impar.");
            
            
            
        
    }
    
}
