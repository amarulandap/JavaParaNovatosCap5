/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;

/**
 * @author Andres_Marulanda
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Estadistica {

    static Scanner Leer = new Scanner(System.in);
    
    // Crear el ArrayList para almecenar los números.
    static ArrayList <Integer> numerosEstadistica = new ArrayList();  

    // media.
    static float media = 0;
    
    public static void main(String[] args) {
        
       // Llamar al programa principal.
       calcularMedia();
       imprimirValoresMayores();
       imprimirValoresMenores();
        
    }
    
    public static void calcularMedia(){

        // Pedir al usuario que ingrese los 10 números y validar que si son números enteros.
        int nuevoNumero = 0; 
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero: ");
            
            try{
                nuevoNumero = Leer.nextInt();
            }catch(Exception e){
                System.err.println("Valor erroneo");
                break;
            }
            numerosEstadistica.add(nuevoNumero);
        }
        
        // Calcular la media.
        int sumatoria = 0;
        
        Iterator <Integer> it = numerosEstadistica.iterator();
        while (it.hasNext()) {
            sumatoria += it.next();    
        }
        
        media = (float) sumatoria /  (float) numerosEstadistica.size();
        System.out.println("El total de elementos es: " + numerosEstadistica.size());
        System.out.println("la sumatoria de elementos es: " + sumatoria);
        System.out.println("El valor de la media es: " + media);    
         
    }
    
    public static void imprimirValoresMayores(){
        
        // Imprimir los valores mayores que la media.
        for (int i = 0; i < 10; i++) {
            int numeroEstadistica = numerosEstadistica.get(i);
            if(numeroEstadistica > media){
                System.out.print(numeroEstadistica + " ");    
            }
        }
    } 
    
    public static void imprimirValoresMenores(){
        
        // Imprimir los valores menores que la media.
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            int numeroEstadistica = numerosEstadistica.get(i);
            if(numeroEstadistica < media){
                System.out.print(numeroEstadistica + " ");    
            }
        }
    }
}
