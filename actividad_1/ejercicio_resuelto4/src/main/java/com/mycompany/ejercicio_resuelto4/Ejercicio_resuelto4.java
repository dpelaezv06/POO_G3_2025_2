/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto4;

/**
 *
 * @author daniel
 */
public class Ejercicio_resuelto4 {
    public static void main(String[] args) {
        /* Declaración de variables */
        double edad_juan; // Variable para almacenar la edad de Juan
        double edad_alberto; // Variable para almacenar la edad de Alberto
        double edad_ana; // Variable para almacenar la edad de Ana
        double edad_madre; // Variable para almacenar la edad de la madre

        /* Asignación de valores y cálculo de edades */
        edad_juan = 9; // La edad de Juan es 9 años
        edad_alberto = edades.edad_alberto(edad_juan); // Calcular la edad de Alberto
        edad_ana = edades.edad_ana(edad_alberto); // Calcular la edad de Ana
        edad_madre = edades.edad_madre(edad_ana, edad_juan, edad_alberto); // Calcular la edad de la madre

        /* Mostrar resultados */
        System.out.println("Edad de Juan: " + edad_juan + " años");
        System.out.println("Edad de Alberto: " + edad_alberto + " años");
        System.out.println("Edad de Ana: " + edad_ana + " años");
        System.out.println("Edad de la madre: " + edad_madre + " años");
    }
}
