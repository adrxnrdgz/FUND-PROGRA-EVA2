/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer10;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        String cade = "";
        int valor = 0;
        int cont = 0;
        int j = 0;
        for ( j = 0; j <= cont; j++) {
            if(cont > 0){
                cont = 0;
                
            }
         
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        cade = input.nextLine();
        
        for (int i = 0; i < cade.length(); i++) {
            char caracter = cade.charAt(i);
            valor = (int)caracter;
            if(valor < 97 || valor > 122 ){
                cont++;
            }
            
        }
        if(cont == 0)
            break;
        }
        System.out.println("La cadena: '" + cade + "' si representa un número válido.");
        
        
    }
    
}
