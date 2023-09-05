/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;
/**
 * @author Andres_Marulanda
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BuscarEnArray {

   static ArrayList <Integer> buscarNumero = new ArrayList();
   static Scanner leer = new Scanner (System.in);
   static short numero = 0;                                     // Número que se buscará dentro del arreglo.
    
    public static void main(String[] args) {
        
        // Cargar datos en el ArrayList.
        short contador = 0;
        while (contador < 20) {            
            buscarNumero.add((int)(Math.random()*100));
            contador += 1;
        }
        
        // Ordenar el ArrayList.
        Collections.sort(buscarNumero);                         // El método sort me organiza el Array de menor a mayor.
        for (Iterator<Integer> iterator = buscarNumero.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
            
        }
        
        short puntoMedio = (short)(buscarNumero.size() / 2);    // Punto medio del Array.
        // short puntoInicial = 0;                                 // Posición inicial del Array.
        boolean encontrado = false;                             // Bandera que indicará que el número fue encontrado en el arreglo.
        
        // Pedir al usuario que ingrese el dato a buscar.
        System.out.println("\nIngrese un número entero: ");
        try{
            numero = leer.nextShort();
        }catch(Exception e){
            System.out.println("Error, ingrese un número entero");
        }
        
        // Empezar a buscar el número.
        while (encontrado == false){
            if (numero == buscarNumero.get(puntoMedio)){        // Buscando que el termino almacenado en el punto medio coincida con el dato buscado.
                encontrado = true;
            }else if (numero < buscarNumero.get(puntoMedio)){   // Número es menor que el dato del punto medio, seguimos buscando en la mitad inferior.
                puntoMedio /= 2;                                
            }else if (numero > buscarNumero.get(puntoMedio)){   // Buscamos en la mitad superior.
                puntoMedio = (short)((buscarNumero.size() - puntoMedio) / 2);
            }else{
                encontrado = false;
            }
        }
        System.out.println("El número " + numero + " es igual a " + buscarNumero.get(puntoMedio) + " y si pertenece al arreglo");
    }   
}
