/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto17;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio_propuesto17 {

    public static void main(String[] args) {
        /* primero se lee el numero ingresado por teclado */
        double radio; // variable que almacena el numero ingresado por teclado
        double perimetro; // variable para almacenar el perimetro del circulo
        double area; // variable para almacenar el area del circulo
        String entrada_string; // variable para almacenar el radio en forma de string
        System.out.print("Ingrese el radio del circulo: "); // mensaje para el usuario
        Scanner entrada = new Scanner(System.in); // objeto de la clase Scanner para leer por teclado
        entrada_string = entrada.next(); // lectura del numero ingresado por teclado
        entrada_string = calculos.comas_porPuntos(entrada_string); // se cambian las comas por puntos en el string para poder usar double

        radio = Double.parseDouble(entrada_string); // se convierte la entrada a double para poder operar con ella       

        /* se llaman los metodos para calcular perimetro y area */

        if (radio < 0) {
            System.out.println("El radio no puede ser negativo");
            entrada.close(); // cerrar el objeto entrada
            return; // salir del programa si el numero es negativo
        }else{
        perimetro = calculos.perimetro_circulo(radio); // se calcula el perimetro del circulo
        area = calculos.area_circulo(radio);         // se calcula el area del circulo

        /* mostrar los resultados por consola */
        System.out.println("El perimetro es " + perimetro); 
        System.out.println("El area es " + area);

        entrada.close(); // cerrar el objeto entrada
        }
    }
}
