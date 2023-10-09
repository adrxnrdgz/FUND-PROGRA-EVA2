/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    int califa;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Introduce la calificacion");
    califa = input.nextInt();
    
    if (califa >= 70){// if (expresion a evaluar)
            // LAS LLAVES SE USAN CUANDO SON MAS DE UNA INSTRUCCION
            // DENTRO DEL IF, SI ES UNA SOLA, NO SE USAN
            // ESTE BLOQUE SIEMPRE ES VERDAD!!
        System.out.println("Aprobado: viaje a Cancún!!!");//Pertenece al if
        System.out.println("Felicidades!!");//no pertenece al if
    }else// --> si no. ES OPCIONAL!!!
        //ESTE BLOQUE SIEMPRE ES PARA FALSO
        System.out.println("No Acreditado: A Picar Piedra!!");
    
    System.out.println("FIN DEL PROGRAMA!!");
        
    
    }
    
}
