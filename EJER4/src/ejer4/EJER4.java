/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER4 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nume;
        int fin = 1;
        int captu = 0;
        
        Scanner input = new Scanner(System.in);
        
        while(true){
        System.out.println("Introduce un número:");
        nume = input.nextInt();
        
        if(nume < 0)
            System.out.println("EL número " + nume + " es negativo");
        if(nume > 0)
            System.out.println("EL número " + nume + " es positivo");
        else if(nume == 0)
            System.out.println("Es cero");
                
        System.out.println("¿Desea terminar el programa? si= 1 no= 2");
        captu = input.nextInt();
        
        if(captu == fin){
                System.out.println("Fin del programa");
            break;
        }else
            continue;  
        
        }
    }       
} 

