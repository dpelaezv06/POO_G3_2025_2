/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_resuelto4;

/**
 *
 * @author daniel
 */

public class edades {
    /* Método para calcular la edad de Juan, Alberto, Ana y la madre */

    static double edad_alberto(double edad_juan){
        double edad_alberto; // Variable para almacenar la edad de Alberto
        edad_alberto = 2 * edad_juan / 3; // La edad de Alberto es dos tercios de la edad de Juan
        return edad_alberto;
    }
    
    static double edad_ana(double edad_alberto){
        double edad_ana; // Variable para almacenar la edad de Ana
        edad_ana = 4 * edad_alberto / 3; // La edad de Ana es cuatro tercios de la edad de Alberto
        return edad_ana;
    }

    static double edad_madre(double edad_ana, double edad_juan, double edad_alberto){
        double edad_madre; // Variable para almacenar la edad de la madre
        edad_madre = edad_ana + edad_juan + edad_alberto; // La edad de la madre es la suma de las edades de Ana, Juan y Alberto
        return edad_madre;
    }
}
