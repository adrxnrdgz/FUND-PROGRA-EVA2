/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int califaN;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el valor de la califa:");
        califaN = input.nextInt();
        
        
        
        if ((califaN >= 0) &&  (califaN <= 100)){
         System.out.println("El numero " + califaN + " es una calificacion valida");
            
            if(califaN >= 90)
                System.out.println("A");
            else if((califaN >= 80) && (califaN <= 89))
                System.out.println("B");
            else if((califaN >= 70) && (califaN <= 79))
                System.out.println("C");
            else if((califaN >= 60) && (califaN <= 69))
                System.out.println("D");
            else if (califaN < 60)
                System.out.println("F");
            
          
        }else 
            System.out.println("El numero " + califaN + " no es una calificacion valida");
            
            
            
            
            
            
 
            
                
        
        
    }
    
}
