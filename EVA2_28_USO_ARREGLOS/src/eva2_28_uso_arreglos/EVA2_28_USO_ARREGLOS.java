/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cant;
        int[] califas;//Aqui el arreglo no existe
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántas calificaciones quieres caputrar?");
        cant = input.nextInt();
        //ya que sabemos cuantas califas necesitamos, creamos el arreglo
        califas = new int[cant];//creamos el arreglo
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificación:");
            califas[i] = input.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("[" + califas[i] + "]");
            
        }
    }
    
}
