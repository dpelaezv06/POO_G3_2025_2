/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto4;

/**
 *
 * @author daniel
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos desde la entrada estándar

public class Ejercicio_resuelto4 {
    public static void main(String[] args) {
        /* Declaración de variables */
        double edad_juan; // Variable para almacenar la edad de Juan
        double edad_alberto; // Variable para almacenar la edad de Alberto
        double edad_ana; // Variable para almacenar la edad de Ana
        double edad_madre; // Variable para almacenar la edad de la madre

        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer datos desde la entrada estándar

        /* Asignación de valores y cálculo de edades */
        System.out.print("Ingrese la edad de Juan: "); // Solicitar al usuario que ingrese la edad de Juan
        edad_juan = scanner.nextDouble(); // Leer la edad de Juan desde la entrada estándar
        if (edad_juan < 0) { // Validar que la edad de Juan no sea negativa
            System.out.println("La edad de Juan no puede ser negativa.");
            scanner.close(); // Cerrar el objeto Scanner
            return; // Salir del programa si la edad es negativa
        }
        edad_alberto = edades.edad_alberto(edad_juan); // Calcular la edad de Alberto
        edad_ana = edades.edad_ana(edad_alberto); // Calcular la edad de Ana
        edad_madre = edades.edad_madre(edad_ana, edad_juan, edad_alberto); // Calcular la edad de la madre

        /* Mostrar resultados */
        System.out.println("Edad de Juan: " + edad_juan + " años");
        System.out.println("Edad de Alberto: " + edad_alberto + " años");
        System.out.println("Edad de Ana: " + edad_ana + " años");
        System.out.println("Edad de la madre: " + edad_madre + " años");
        scanner.close(); // Cerrar el objeto Scanner
    }
}
