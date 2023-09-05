/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;

/**
 *
 * @author Andres_Marulanda
 */

import java.util.ArrayList;

public class ArraysLists {

    public static void main(String[] args) {
        
        declararEInicializarUnArrayList();
        
    }
    
    public static void declararEInicializarUnArrayList(){
        
        /**
         * En este método veremos las manera básicas de trabajar con un ArrayList.
         * 
         * tipo_dato [] nombre_array = new tipo_dato [];
         * 
         * Nombre_Clase nombre_objeto = new Nombre_Clase(Parámetros).
         */
        
        ArrayList <Integer> arregloUno = new ArrayList <Integer>();     // Creamos un Array que solo almacena datos tipo Entero.
        ArrayList arregloDos = new ArrayList();
        
        // Agregarle datos al ArrayList dos. 
        // Un ArrayList acepta datos de diferente tipo.
        
        arregloDos.add("Hola, soy un Array");
        arregloDos.add(15);
        arregloDos.add(10.5);
        arregloDos.add("a");
        
        // Para mostrar el contenido del Array usaremos un ciclo for.
        
            // El método size nos retorna el número de elementos del Array.
        
        for (int i = 0; i < arregloDos.size() ; i++) {
            
            // Con el método get obtenemos el elemento que hay almacenado en cada posición.
            
            System.out.println("Elemento en la posición: " + i + " : " + arregloDos.get(i));
        } 
        
        for (int j = 0; j < 20; j++) {
            
            arregloUno.add((int)(Math.random()*500));
            
        }
        
        for (int k = 0; k < arregloUno.size(); k++) {
            
            System.out.println(arregloUno.get(k));
        }
    }
    
}
