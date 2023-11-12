/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer8;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String alf;
       
        while(true){
            System.out.println("Introduzca una letra: ");
            alf = input.nextLine();
            
            if(alf.equals(" ")){
                System.out.println("Fin del programa.");
                break;
            }
        switch(alf){
            //VOCALES
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Es vocal.");
                break;
            //CONSONANTES
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "ñ":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "x":
            case "y":
            case "z":
                System.out.println("Es consonante.");
                break;
                
            default:

            } 
            
        }
        
    }
    
}
