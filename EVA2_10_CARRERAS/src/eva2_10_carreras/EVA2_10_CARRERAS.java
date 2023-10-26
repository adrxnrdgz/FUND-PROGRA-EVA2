/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_carreras;

import java.util.Scanner;


/**
 *
 * @author angel
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carre;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las iniciales de su carrera:");
        carre = input.nextLine();
        
        switch(carre){
            case "isc":
                System.out.println("Ingeniería en Sistemas Computacionales");
                break;
            case "inf":
                System.out.println("Ingeniería Informática");
                break;
            case "la":
                System.out.println("Licenciatura en Administración");
                break;
            case "arq":
                System.out.println("Arquitectura");
                break;
            case "ind":
                System.out.println("Igeniería Industrial");
                break;
            case "idi":
                System.out.println("Ingeniería en Diseño Industrial");
                break;
            case "ige":
                System.out.println("Ingeniería en Gestión Empresarial");
                break;
            default:
                System.out.println("No se encontró ninguna carrera con esas iniciales");
        
        }
            
        
        
        
        
    }    
} 
         
        
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

