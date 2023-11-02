/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_promedio_califas;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA2_15_PROMEDIO_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantCali;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de califificaciones a capturar:");
        cantCali = input.nextInt();
        int sumaCalifas = 0;
        
        //ACUMULADOR
        
        for (int i = 1; i <= cantCali; i++) {
            System.out.println("Introduce la calificacion:");
            int califa = input.nextInt();
            //ACUMULADOR
            sumaCalifas = sumaCalifas + califa;
               
        }
            System.out.println("La sumatoria = " + sumaCalifas);
            double promedio = sumaCalifas / (cantCali * 1.0);
            System.out.println("El promedio de calificaciones es = " + promedio);    
            
            
                
        
        
    }
    
}
