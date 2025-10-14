/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_2;

/**
 *
 * @author daniel
 */
public class Notas {
    double[] lista_notas; // Array para almacenar las notas
    
    public Notas(){
        lista_notas = new double[5]; // Inicializa el array con capacidad para 5 notas
    }

    double calcular_promedio(){
        /* metodo para calcular el promedio de las notas */
        double suma = 0; // variable para almacenar la suma de las notas
        double promedio; // variable para almacenar el promedio
        for (int contador = 1; contador < lista_notas.length; contador++) { // recorre el array de notas
            suma += lista_notas[contador]; // suma cada nota al total
        }
        promedio = suma / (lista_notas.length); // calcula el promedio
        return promedio; // retorna el promedio
    }

    double calcular_desviacion(){
        /* metodo para calcular la desviacion estandar de las notas */
        double promedio = calcular_promedio(); // obtiene el promedio de las notas
        double suma = 0; // variable para almacenar la suma de las diferencias al cuadrado
        double desviacion; // variable para almacenar la desviacion estandar
        for (int contador = 1; contador < lista_notas.length; contador++) { // recorre el array de notas
            suma += Math.pow((lista_notas[contador] - promedio), 2); // suma la diferencia al cuadrado
        }
        desviacion = Math.sqrt(suma / (lista_notas.length)); // calcula la desviacion estandar
        return desviacion; // retorna la desviacion estandar
    }
    
}
