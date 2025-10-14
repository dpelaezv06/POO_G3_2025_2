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

    double encontrar_mayor(){
        /* metodo para encontrar la nota mayor */
        double mayor = lista_notas[0]; // crea una variable para encontrar la nota mayor y la inicializa con la primera nota
        for (int contador = 1; contador < lista_notas.length; contador++) { // recorre el array de notas
            if (lista_notas[contador] > mayor) { // si la nota actual es mayor que la variable mayor
                mayor = lista_notas[contador]; // actualiza la variable mayor
            }
        }
        return mayor; // retorna la nota mayor
    }

    double encontrar_menor(){
        /* metodo para encontrar la nota menor */
        double menor = lista_notas[0]; // crea una variable para encontrar la nota menor y la inicializa con la primera nota
        for (int contador = 1; contador < lista_notas.length; contador++) { // recorre el array de notas
            if (lista_notas[contador] < menor) { // si la nota actual es menor que la variable menor
                menor = lista_notas[contador]; // actualiza la variable menor
            }
        }
        return menor; // retorna la nota menor
    }
    
}
