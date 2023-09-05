/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;


/**
 *
 * @author Andres_Marulanda
 */
public class InicializarArray {

    static short[] arrayNumeros = new short[100];       // variable de clase.
    
    public static void main(String[] args) {
        
        /**
         * Debemos crear 3 métodos:
         * imprimirArray()
         * inicializarPares()
         * inicializarImpares()
        */
        
        inicializarPares();
        inicializarImpares();
    }
    
    public static void inicializarPares(){
        
        // Arreglo de 100 elementos que contendrá solo números pares.
        
        // Declarar el array.
        // short [] arrayPares = new short[100];
        short inicioPares = 2;
        
        arrayNumeros[0] = inicioPares;
        for (int i = 1; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = inicioPares += 2;    
        }
        
        imprimirArray(arrayNumeros);
    }
    
    public static void inicializarImpares(){
        
        // Arreglo de 100 elementos que contendrá solo números impares.
        
        // Declarar el Array.
        // short[] arrayImpares = new short[100];
        short inicioImpares = 1;
        
        arrayNumeros[0] = inicioImpares;
        for(int i = 1; i < arrayNumeros.length; i++){
            arrayNumeros[i] = inicioImpares += 2;
        }
        
        imprimirArray(arrayNumeros);
    }
    
    public static void imprimirArray(short[] arregloUnidimesional){
        
        // Recorrer el Array usando un ciclo for.
        
        System.out.println("\n");
        for (int i = 0; i < arregloUnidimesional.length; i++) {
            System.out.print(arregloUnidimesional[i] + " ");    
        }
    }
}
