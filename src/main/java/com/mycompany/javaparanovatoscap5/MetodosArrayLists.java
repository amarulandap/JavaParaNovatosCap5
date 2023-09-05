/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;

/**
 *
 * @author Andres_Marulanda
 */

// Importar la clase ArrayList.
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class MetodosArrayLists {
    
    static Scanner Leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        /**
         * Clase donde probaremos cada uno de los métodos de la clase ArrayList.
         */
        
        // Instanciar un objeto de la clase Arraylist.
        ArrayList <Integer> probarMetodos = new ArrayList <Integer>();  //Array que solo recibirá datos de tipo entero.
        
        // Imprimir el tamaño incial.
        System.out.println("El tamaño inicial del Array es: " + probarMetodos.size());
        
        // Agregar objetos.
        agregarDatos(probarMetodos);
        
        //Nuevo tamaño.
        System.out.println("El tamaño del Array es: " + probarMetodos.size());
        
        // Imprimimos el nuevo Array.
        imprimirArray(probarMetodos);
        
        // Añadir un objeto en una posición.
        probarMetodos.add(3, 25);
        imprimirArray(probarMetodos);
        
        // Eliminar el objeto que acabamos de ingresar.
        probarMetodos.remove(3);                                    // Remove (int index) me permite eliminar el objeto en la posición indicada
        iteradores(probarMetodos);
        
        System.out.println("\n" + probarMetodos.remove("8"));       // Remove (Object o) elimina el objeto que paso como parámetro.
        
        // Validar si el Array contiene un objeto.
        System.out.println("\n" + probarMetodos.contains(4));       // Contains me retorna True si el Array contiene al objeto.
        
        // Verificar la posición ocupada por un objeto.
        System.out.println("\n" + probarMetodos.indexOf(2));        // IndexOf me retorna la posición en la que se encuentra el objeto.(-1).
        
        // Cambiar un objeto por otro.
        probarMetodos.set(3, 100);                                  // Set me coloca en la posición indicada, el nuevo elemento.
        iteradores1(probarMetodos);
        
        // Borrar todos los objetos del Array.
        probarMetodos.clear();                                      // Clear me permite eliminar todos los objetos del Array.
        System.out.println("\nEl tamaño del Array es: " + probarMetodos.size());
        
        
        
    }
    
    public static void agregarDatos(ArrayList probarMetodos){
        
        int objeto = 0;
        
        System.out.println("\n");
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Ingrese el entero a agregar: ");
            try{
                objeto = Leer.nextInt();
            }catch(Exception e){
                System.out.println("Error, ingrese un dato de tipo entero.");
                break;                                                              // Con Break interrumpimos la ejecución de un ciclo.
            } 
            
            probarMetodos.add(objeto);                              // Add añade el objeto al final del array.
        }
   
    }
    
    public static void imprimirArray(ArrayList probarMetodos){
        
        System.out.println("\n");
        for (int i = 0; i < probarMetodos.size(); i++) {            // Size me devuelve el tamaño del Array.
            System.out.print(probarMetodos.get(i) + " ");           // Get me devuelve el objeto almacenado en la posición indicada.
        }
    }
    
    public static void iteradores(ArrayList probarMetodos){
        
        System.out.println("\n");
        Iterator <ArrayList> it = probarMetodos.iterator();        // Instanciar el iterador.
        while(it.hasNext()){                                       // HasNext es un método que retorna True mientras el objeto no sea el último del Array.
            System.out.print(it.next() + " ");                     // Next me referencia al siguiente objeto.
        }
    }
    
    public static void iteradores1(ArrayList probarMetodos){
        
        System.out.println("\n");
        for (Iterator iterator = probarMetodos.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
            
        }
    }
    
}
