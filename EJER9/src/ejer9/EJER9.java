/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer9;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduzca una cadena:");
        Scanner input = new Scanner(System.in);
        String cadena = input.nextLine();
        
        System.out.println("Introduzca el caracter a buscar:");
        String busCaracter = input.nextLine();
        
        if(busCaracter.length() != 1){
            System.out.println("Introduce un solo caracter.");
            return;    
        }
        
        int contador = 0;
        char caracter = busCaracter.charAt(0);
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == caracter){
                contador++;
            }
        }
         
        System.out.println("El caracter aparece: " + contador + " veces en la cadena.");
                
        
         
        
    }
}
