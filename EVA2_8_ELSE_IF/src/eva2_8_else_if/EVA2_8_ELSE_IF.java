/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_else_if;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_8_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número del mes:");
        mes = input.nextInt();
        
        if((mes >= 1) && (mes <= 12)){//(mes > 0) && (mes < 13)
            System.out.println("El número " + mes + " es un mes válido!!");
            
            if(mes == 1)
                System.out.println("ENNERO");
            else if(mes == 2)
                System.out.println("FEBRERO");
            else if(mes == 3)
                System.out.println("MARZO");
            else if(mes == 4)
                System.out.println("ABRIL");
            else if(mes == 5)
                System.out.println("MAYO");
            else if(mes == 6)
                System.out.println("JUNIO");
            else if(mes == 7)
                System.out.println("JULIO");
            else if(mes == 8)
                System.out.println("AGOSTO");
            else if(mes == 9)
                System.out.println("SEPTIEMBRE");
            else if(mes == 10)
                System.out.println("OCTUBRE");
            else if(mes == 11)
                System.out.println("NOVIEMBRE");
            else if(mes == 12)
                System.out.println("DICIEMBRE");
            
        
        }else
            System.out.println("El número " + mes + " no es un mes válido!!");
        
        
    }
    
}
