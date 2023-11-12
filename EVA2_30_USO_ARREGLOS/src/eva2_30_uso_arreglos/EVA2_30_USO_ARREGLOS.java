/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_30_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] listaProd = new String[10];
        listaProd[0] = "Tacos";
        listaProd[1] = "Tortas";
        listaProd[2] = "Tamales";
        listaProd[3] = "Tlacoyos";
        listaProd[4] = "Tlayudas";
        listaProd[5] = "Tampiqueñas";
        listaProd[6] = "Tortas Ahogadas";
        listaProd[7] = "Tchilaquiles";
        listaProd[8] = "T-Bone";
        listaProd[9] = "Tripitas";
        //Si tenemos los datos pireviamente, se aconseja hacerlo asi:
        //String[] listaProd = {"Tacos", "Tortas"}; //Equivalente
        
        double[] listPrecios = {20,40,15,50,30,54,60,200,400,10};
        
        System.out.println("-----MENÚ-----");
        for (int i = 0; i < listaProd.length; i++) {
            System.out.println(i + " - " + listaProd[i] + ": $" + listPrecios[i]);
            
        }
        
        Scanner input = new Scanner(System.in);
        int opc, cant;
        System.out.println("¿Qué deseas ordenar?");
        opc = input.nextInt();
        System.out.println("¿Cuántss órdenes?");
        cant = input.nextInt();
        System.out.println("Tu total es de: " + (cant * listPrecios[opc]));
      
    }
    
}
