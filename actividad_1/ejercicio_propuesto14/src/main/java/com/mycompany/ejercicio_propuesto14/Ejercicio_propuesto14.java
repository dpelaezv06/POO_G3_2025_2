/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto14;

/**
 *
 * @author daniel
 */

/* Importacion de librerias para leer las entradas de consola por teclado */

import java.util.Scanner;

public class Ejercicio_propuesto14 {

    public static void main(String[] args) {
        /* primero se lee el numero ingresado por teclado */
        double numero; // variable que almacena el numero ingresado por teclado
        double cuadrado; // variable para almacenar el cuadrado del numero
        double cubo; // variable para almacenar el cubo del numero
        String entrada_string; // variable para almacenar en la entrada en forma de string
        System.out.print("Ingrese un numero: "); // mensaje para el usuario
        Scanner entrada = new Scanner(System.in); // objeto de la clase Scanner para leer por teclado
        entrada_string = entrada.next(); // lectura del numero ingresado por teclado
        entrada_string = calculos.comas_porPuntos(entrada_string); // se cambian las comas por puntos en el string para poder usar double

        numero = Double.parseDouble(entrada_string); // se convierte la entrada a double para poder operar con ella       

        /* se llaman los metodos para calcular cuadrados y cubos */
        cuadrado = calculos.cuadrado(numero); // se calcula el cuadrado del numero
        cubo = calculos.cubo(numero);         // se calcula el cubo del numero

        /* mostrar los resultados por consola */
        System.out.println("El cuadrado es " + cuadrado); 
        System.out.println("El cubo es " + cubo);

        entrada.close(); // cerrar el objeto entrada
    }


}
