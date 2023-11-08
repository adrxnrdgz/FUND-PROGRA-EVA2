/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer6;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int dec, mod;
        String bin = "";
        
        System.out.println("Ingrese un número decimal para convertir a binario:");
        dec = input.nextInt();
        
        while(dec > 0){
        mod = dec % 2;
        bin = bin + mod;
        dec = dec / 2;
        
        }
        System.out.println("EL número en binario es: " + bin);
         
    }
    
}
