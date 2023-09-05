/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;

/**@author Andres_Marulanda*/

import java.util.Scanner;
import java.lang.Math;

public class EjercicioEstadisticaConvencionales {

    static Scanner Leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Le vamos a solicitar al usuario ingresar los datos (enteros).
        
        int [] datosEstadistica = new int [10];
        
        for (int i = 0; i < datosEstadistica.length; i++) {
            
            int datoIngresado = 0;
            
            try{
                System.out.println("Ingrese un número entero: ");
                datoIngresado = Leer.nextInt();
            }catch(Exception e){
                System.out.println("Dato erroneo, ingrese un número entero");
                break;
            }
            
            datosEstadistica[i] = datoIngresado;
        }
        
        // Ordenar el arreglo de menor a mayor.
        
        int menor = 0;
        
        for (int i = 0; i < datosEstadistica.length - 1; i++) {
            for (int j = i + 1; j < datosEstadistica.length; j++){
                if (datosEstadistica[j] < datosEstadistica[i]){
                    menor = datosEstadistica[j];
                    datosEstadistica[j] = datosEstadistica[i];
                    datosEstadistica[i] = menor;
                }
            }    
        }
        
        // Imprimir el arreglo.
        
        byte control = 0;
        
        while (control < datosEstadistica.length) {  
            System.out.print(" " + datosEstadistica[control]); 
            control += 1;
        }
        
        // Hallar el valor mínimo y el máximo.
        
        int valorMinimo = datosEstadistica[0];
        int valorMaximo = datosEstadistica[datosEstadistica.length - 1];
        
        System.out.println("\nEl valor mínimo es: " + valorMinimo + " y el valor máximo es: " + valorMaximo);
        
        // Hallar el valor de la media.
        
        float valorMedia = 0;
        int acumulado = 0;
        byte control1 = 0;
        
        while (control1 < datosEstadistica.length){
            acumulado += datosEstadistica[control1];
            control1 += 1;
        }
        valorMedia = (float)acumulado / datosEstadistica.length;
        System.out.println("\nEl valor de la media es: " + valorMedia);
        
        // Calcular la varianza.
        
        int sumatoria = 0;
        float varianza = 0;
        float desviacionEstandar = 0;
        for (int i = 0; i < datosEstadistica.length; i++) {
            sumatoria += Math.pow(datosEstadistica[i] - valorMedia, 2);    
        }
        varianza = (float)sumatoria / datosEstadistica.length;
        desviacionEstandar = (float) Math.sqrt(varianza);
        System.out.println("\nEl valor de la varianza es: " + varianza);
        System.out.println("\nEl valor de la desviación estándar es: " + desviacionEstandar);
    }
    
}
