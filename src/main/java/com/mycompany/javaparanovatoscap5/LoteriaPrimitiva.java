/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaparanovatoscap5;

/**
 * @author Andres_Marulanda
 */

import java.util.ArrayList;
import java.lang.Math;
import java.util.Iterator;

public class LoteriaPrimitiva {

    
    public static void main(String[] args) {
        // Crear un programa que genere al azar 6 números enteros positivos y diferentes.
        
        // Declarar el ArrayList.
        ArrayList <Byte> loteria = new ArrayList();
        
        // Agregar datos al ArrayList.
        loteria.add((byte)(Math.random()*50));        // Agregar el primer dato.
        
        byte numeroLoteria = 0;                       // Almacenar el dato generado.
        for(byte i = 1; i < 6; i++){
            numeroLoteria = (byte)(Math.random()*50);
            if (loteria.contains(numeroLoteria)){
               i--; 
            }else{
               loteria.add(numeroLoteria);
            }
        }
        
        for (Iterator<Byte> iterator = loteria.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
            
        }
    }   
}
