/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package andres_marulanda.javaparanovatoscap5;

/**
 *
 * @author Andres-Marulanda
 */
public class JavaParaNovatosCap5 {

    public static void main(String[] args) {
        
        declararEInicializarUnArray();  
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
        
        int[] primerArregloUnidimensional = {0, 5, 3, 8, 6, 5, 2, 10, 3, 1};
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
        
        System.out.println("\nsuma=" + suma); 
        
        ordenarArreglo(primerArregloUnidimensional);
   
    }
    
    public static void ordenarArreglo(int[] arregloUnidimensional){
        
        // Orednar el arreglo de mayor a menor.
        
        int mayor = 0;
        
        for (int i = 0; i < 9; i++){
            for (int j = i + 1; j < 10; j++){
                
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
        
        for (int k = 0; k < 10; k++){
            System.out.println("\n" + arregloUnidimensional[k]);
        }
        
    }
  
}
