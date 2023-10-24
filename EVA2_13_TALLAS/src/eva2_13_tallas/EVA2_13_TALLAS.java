/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_13_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int talla;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor numerico de la talla:");
        talla = input.nextInt();
        
        switch(talla){
            case 29:
                System.out.println("Small");
                break;
            case 42:
                System.out.println("Medium");
                break;
            case 44:
                System.out.println("Large");
                break;
            case 48:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("El numero " + talla + " no es una talla valida");
                
        
        
        
        }
        
        
        
        
    }
    
}
