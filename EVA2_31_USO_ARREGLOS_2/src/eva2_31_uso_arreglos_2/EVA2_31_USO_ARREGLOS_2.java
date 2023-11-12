/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_uso_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_31_USO_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //GENERAR UN ARREGLO TAMAÑO 15
        //LLENALO CON VALORES ALEATORIOS: 0 - 99
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
        System.out.println("");
        System.out.println("¿Qué valor necesitas?");
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        int posi = -1;
        
        //Busqueda
        for (int i = 0; i < arreglo.length; i++) {
            if(valor == arreglo[i]){
                posi = i;
                break;
                     
            }
                
        }
        if(posi != -1)
            System.out.println("El valor está en la posición: " + posi);
        else
            System.out.println("Valor no encontrado.");
        
    }
    
}
