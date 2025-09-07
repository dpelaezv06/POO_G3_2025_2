/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuleto5;

/**
 *
 * @author daniel
 */
public class Ejercicio_resuleto5 {

    public static void main(String[] args) {
        /* declaracion de variables */
        double suma = 0; // variable para almacenar la suma inicializada en 0
        double x = 20; // variable x inicializada en 20
        double y = 0; // variable y inicializada en 0

        /* se realiza el seguimiento */
        suma = 0; // suma inicia en 0
        suma = calculos.sumar(suma, x); // suma = 0 + 20
        y = 40; // y = 40
        x = calculos.calcular_x(x, y); // x = 20 + 40^2 = 1620
        suma = calculos.sumar(suma, x/y); // suma = 20 + 1620/40 = 60.5
        
        /* se muestra el resultado final */
        System.out.println("El valor final es: " + suma); // se imprime el resultado
    }
}
