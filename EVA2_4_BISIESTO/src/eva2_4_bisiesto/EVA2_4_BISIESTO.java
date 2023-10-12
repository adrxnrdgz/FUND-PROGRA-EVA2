/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int year, residuo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año a evaluar:");
        year =  input.nextInt();
        
        residuo = year % 4;
        if(residuo == 0){  //verdad: el año es divisible entre 4
            residuo = year % 100;
            if(residuo == 0){  //verdad: el año es divisible entre 100
                residuo = year % 400;
                if(residuo == 0){  //verdad: el año es divisible entre 400
                    System.out.println("ES AÑO BISIESTO");
                    
                }else
                    System.out.println("NO ES AÑO BISIESTO");
                }else 
                    System.out.println("ES AÑO BISIESTO");
            }else 
                System.out.println("NO ES AÑO BISIESTO");
            
        }
            
        
        
    }
    
