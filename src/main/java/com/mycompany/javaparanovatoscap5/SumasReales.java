/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;

/**
 * @author Andres_Marulanda
 */

import java.util.Scanner;       // Solicitar al usuario que ingrese los números desde el teclado.
import java.util.ArrayList;    
import java.util.Iterator;

public class SumasReales {
    
    static Scanner Leer = new Scanner (System.in);              // Variable para leer los datos desde el teclado. 
    static ArrayList <Float> sumasReales = new ArrayList();     // Arreglo para almacenar los datos ingresados por los usuarios.
    
    public static void main(String[] args) {
        
        ingresarDatos();
        sumarDatos();
    
    }
    
    public static void ingresarDatos(){
        
        float numeroReal = 0;                                   // Almacenar cada uno de los datos ingresados.
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número real: ");
            try{
                numeroReal = Leer.nextFloat();
            }catch(Exception e){
                System.out.println("Error, ingrese un dato numérico");
                // e.printStackTrace();
                break;
            }
            sumasReales.add(numeroReal);
        }
        
    }
    
    public static void sumarDatos(){
        
        float sumaPositivos = 0;
        float sumaNegativos = 0;
        /**
         *  byte contador = 0;
            while (contador < sumasReales.size()) {
            
            if (sumasReales.get(contador) < 0) {
                sumaNegativos += sumasReales.get(contador);
            }else{
                sumaPositivos += sumasReales.get(contador);
            } 
            
            contador++;
        }
         */
        
        Iterator <Float> it = sumasReales.iterator();
        while (it.hasNext()) {
            Float next = it.next();                                 // En next se almacena cada uno de los datos.
            
            if (next < 0){
                sumaNegativos += next;
            }else{
                sumaPositivos += next;
            }    
        }

        System.out.println("Los datos positivos suman = " + sumaPositivos);
        System.out.println("Los datos negativos suman = " + sumaNegativos);
    }
    
    
    
}
