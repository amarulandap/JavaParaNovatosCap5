/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;

/**
 * @author Andres_Marulanda
 */

import java.util.Scanner;

public class LaClaseString {

    static Scanner Leer = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        // Declarar un objeto de la clase String.
        String cadena1 = "Hola Mundo cruel";
        String cadena2 = new String("CADENA DE LETRAS MAYÚSCULAS");       //Instanciar u objeto de la clase cadena.
        String cadena3 = " ,mi nombre es Andres Marulanda";
        String cadena4 = "hola mundo cruel";
        
        // Mostrar la longitud del String cadena1.
        System.out.println("La longitud de la cadena1 es: " + cadena1.length());
        
        // Concatenar dos cadenas de caracteres.
        System.out.println(cadena1.concat(cadena3));
        
        // Contar el número de diferencias alfabéticas entre dos cadenas.
        System.out.println("El número de diferencias alfabéticas entre las cadenas es: " + cadena1.compareTo(cadena4));
        
        // Comparar el contenido de dos objetos tipo String. (== me sirve para comparar las posiciones de memoria).
        System.out.println("¿Son iguales las cadenas? " + cadena1.equals(cadena4));
        
        // Eliminar los espacios en blanco que pudieran existir al principio o al final.
        System.out.println(cadena3.trim());
        
        // Convertir la cadena a letras minúsculas.
        System.out.println(cadena2.toLowerCase());
        
        // Convertir la cadena a letras mayúsculas.
        System.out.println(cadena4.toUpperCase());
        
        // Reemplazar cada ocurrencia de un carácter.
        System.out.println(cadena2.replace('A', 'o'));
        
        // Obtener un sub String o subcadena.
        System.out.println(cadena1.substring(0, 10));
        
        // Obtener el carácter que está en una determinada posición de la cadena.
        System.out.println("Carácter en la posición 13 de la cadena3: " + cadena3.charAt(13));
        
        // Obtener la posición que ocupa un carácter en la cadena.
        byte pertenece = (byte) cadena3.indexOf(',');
        
        if (pertenece == -1) {
            System.out.println("Carácter no encontrado");
        }else{
            System.out.println("La posición del carácter es: " + pertenece);
        }
        
        // Instanciar un objeto de la clase StringBuffer.
        StringBuffer cadena5 = new StringBuffer("Cadena Stringbuffer 1");
        StringBuffer cadena6 = new StringBuffer("Cadena de prueba StringBuffer 2");
        StringBuffer cadena7 = new StringBuffer ("1 2 3 4 5 6 7 8 9");
        
        // Mostrar la longitud del String cadena5.
        System.out.println("La longitud de la cadena5 es: " + cadena5.length());
        
        // Obtener la capacidad máxima del String (length + 16).
        System.out.println("La capacidad de la cadena 6 es: " + cadena6.capacity());
        
        // Agregar un objeto al final de la cadena.
        System.out.println(cadena5.append(" " + 15));
        
        // Insertar un objeto en la posición indicada.
        System.out.println(cadena5.insert(0, "Esta es la "));
        
        // Invertir el orden de la cadena.
        System.out.println(cadena7.reverse());
        
        // Eliminar uno o varios caracteres.
        System.out.println(cadena7.delete(0, 1));
        
        // Reemplazar parte de los elementos de una cadena. También aplica para la clase String.
        System.out.println(cadena5.replace(0, 5, "String "));
    }
    
}
