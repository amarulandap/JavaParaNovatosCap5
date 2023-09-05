/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaparanovatoscap5;

/**
 *
 * @author Andres_Marulanda
 */
public class ArraysConvencionales {
    
    static int[] primerArregloUnidimensional = {0, 5, 25, 29, 38, 16, 45, 3, 8, 6, 5, 2, 10, 3, 1, 11, 56, 43, 68, 94, 71, 35, 26};         // Arreglo global.

    public static void main(String[] args) {
        
        declararEInicializarUnArray();
        declararEInicializarUnString();
        busquedaSecuencial();
        busquedaBinaria();
        
    }
    
    public static void declararEInicializarUnArray(){
        
        /**
         * Ejercicio para practicar la forma en que se declara y se incializa un Arreglo unidimensional.
         * 
         * tipo_dato nombre_array[].
         * 
         * tipo_dato[] nombre_array.
         * 
         * tipo_dato[] nombre_array = new tipo_dato[cantidad de elementos].
         */
        
        // Declarar e inicializar vectores.
        
        float[] segundoArregloUnidimensional = new float[5];
        String[] tercerArregloUnidimensional = new String[5];
        
        // Agregar datos a los arreglos.
        
        segundoArregloUnidimensional[0] = (float)1.1;
        segundoArregloUnidimensional[1] = (float)2.1;
        segundoArregloUnidimensional[2] = (float)3.1;
        segundoArregloUnidimensional[3] = (float)4.1;
        segundoArregloUnidimensional[4] = (float)5.1;
        
        tercerArregloUnidimensional[0] = "Hola, soy un vector";
        
        // Inicializar un arreglo usando un ciclo for.
        
        for (int i = 1; i < 5; i++) {
            
            tercerArregloUnidimensional[i] = "Posición " + i;
            System.out.println(tercerArregloUnidimensional[i-1]);
        }
        
        
        // Recorrrer los arreglos usando un ciclo for.
        
        for (int j = 0; j < 10; j++) {
            
            System.out.println("\nElemento en la posición " + j + " es " + primerArregloUnidimensional[j]);
        }
        
        // Realizar una operación con los elementos del segundo arreglo.
        
        float suma = 0;
        for (int k = 0; k < 5; k++) {
               
            suma += segundoArregloUnidimensional[k];
        }
        
        System.out.println("\nsuma = " + suma); 
        
        ordenarArreglo(primerArregloUnidimensional);
   
    }
    
    public static void ordenarArreglo(int[] arregloUnidimensional){
        
        // Orednar el arreglo de mayor a menor.
        
        int mayor = 0;
        
        for (int i = 0; i < arregloUnidimensional.length - 1; i++){
            for (int j = i + 1; j < arregloUnidimensional.length; j++){
                
                if (arregloUnidimensional[i] < arregloUnidimensional[j]){
                    mayor = arregloUnidimensional[j];
                    arregloUnidimensional[j] = arregloUnidimensional[i];
                    arregloUnidimensional[i] = mayor;
                }
            }
        }
        
        /**
         * for (int i = 0; i < 9; i++)
         *      for (int j = i + 1; j < 10; j++)
         *          if (arreglo[i] > arreglo[j])
         *                 menor = arreglo[j]
         *                 arreglo[j] = arreglo[i]
         *                 arreglo[i] = menor
         */
        
         System.out.print("\n");
        for (int k = 0; k < arregloUnidimensional.length; k++){
            System.out.print(" " + arregloUnidimensional[k]);
        }
        
    }
    
    public static void declararEInicializarUnString(){
        
        //Declarar una cadena de caracteres.
        char[] cadenaCaracteres = new char[50];
        
        //Declarar un String.
        String cadena1 = " Hola Mundo N";
        
        cadenaCaracteres[0] = 'H';
        cadenaCaracteres[1] = 'o';
        cadenaCaracteres[2] = 'l';
        cadenaCaracteres[3] = 'a';
        cadenaCaracteres[4] = ' ';
        cadenaCaracteres[5] = 'M';
        cadenaCaracteres[6] = 'u';
        cadenaCaracteres[7] = 'n';
        cadenaCaracteres[8] = 'd';
        cadenaCaracteres[9] = 'o';
        cadenaCaracteres[10] = '\0';            //Caracter nulo que indica el final de la cadena.
        cadenaCaracteres[11] = ' ';
        cadenaCaracteres[12] = 'N';
        
        System.out.println("\n");
        for (int i = 0; i < 13; i++) {
            System.out.print(cadenaCaracteres[i]);
        }
        
        System.out.println(cadena1);
    }
    
    public static void busquedaSecuencial(){
        
        int datoAEncontrar = 94;
        byte variableControl = 0;
        byte contador = 0;
        
        
        // Con el método Length obtengo el tamaño del arreglo.
        
        while (variableControl < primerArregloUnidimensional.length) {                          
            if (primerArregloUnidimensional[variableControl] ==  datoAEncontrar){
                System.out.println("\nEl número " + datoAEncontrar + " si pertenece al arreglo");
                break;
            }else{
                contador++;
            }
            variableControl++;
        }
        if(contador == primerArregloUnidimensional.length){
            System.out.print("\nEl número " + datoAEncontrar + " no pertenece al arreglo");    
        }  
    }
    
    public static void busquedaBinaria(){
       
        // Lo ordenamos de mayor a menor.
        
        ordenarArreglo(primerArregloUnidimensional);
        
        // Declaramos dos variables que ubicaremos al principio y al final del arreglo.
        
        byte inicioArreglo = 0;
        byte finArreglo = (byte) (primerArregloUnidimensional.length - 1);
        
        int datoAEncontrar = 56;
        byte encontrado = 0;
        
        while ((inicioArreglo < finArreglo - 1) && (encontrado == 0)) {            
            
            // calculamos la posición media del arreglo.
            
            byte posicionMedia = (byte) (inicioArreglo + ((finArreglo - inicioArreglo) / 2));
            
            if (primerArregloUnidimensional[posicionMedia] == datoAEncontrar) {
                encontrado = 1;    
            }else if (primerArregloUnidimensional[posicionMedia] < datoAEncontrar){
                finArreglo = posicionMedia;
            }else if (primerArregloUnidimensional[posicionMedia] > datoAEncontrar){
                inicioArreglo = posicionMedia;
            }     
        }
        
        if (encontrado == 1){
            System.out.println("\nEl número " + datoAEncontrar + " pertenece al arreglo.");
        }else{
            System.out.println("\nEl número " + datoAEncontrar + " no pertenece al arreglo.");
        }    
    }
}
