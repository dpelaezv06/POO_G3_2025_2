/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto12;

/**
 *
 * @author daniel
 */

 import java.util.Scanner;
public class Ejercicio_propuesto12 {

    public static void main(String[] args) {
        /* programa que calcula el salario neto de un empleado */

        /* declaracion de variables */
        double horas_trabajadas;
        double valor_hora;
        double porcentaje_retefuente;
        double salario_bruto;
        double retefuente;
        double salario_neto;

        /* objeto de la clase Scanner para leer por teclado */
        Scanner Scanner = new Scanner(System.in);

        /* escaneo de valores a las variables  por terminal*/
        System.out.print("Ingrese las horas trabajadas en la semana: "); // mensaje para el usuario
        horas_trabajadas = Scanner.nextDouble(); // horas trabajadas en la semana
        if (horas_trabajadas < 0) {
            System.out.println("Las horas trabajadas no pueden ser negativas");
            Scanner.close(); // cerrar el objeto Scanner
            return; // salir del programa si las horas son negativas
        }
        System.out.print("Ingrese el valor de la hora trabajada: "); // mensaje para el usuario
        valor_hora = Scanner.nextDouble() ; // valor de la hora trabajada
        if (valor_hora < 0) {
            System.out.println("El valor de la hora no puede ser negativo");
            Scanner.close(); // cerrar el objeto Scanner
            return; // salir del programa si el valor de la hora es negativo
        }
        System.out.print("Ingrese el porcentaje de retefuente: "); // mensaje para el usuario
        porcentaje_retefuente = Scanner.nextDouble(); // porcentaje de retefuente
        if (porcentaje_retefuente < 0) {
            System.out.println("El porcentaje de retefuente no puede ser negativo");
            Scanner.close(); // cerrar el objeto Scanner
            return; // salir del programa si el porcentaje es negativo
        }
        if (porcentaje_retefuente > 100) {
            System.out.println("El porcentaje de retefuente no puede ser mayor a 100");
            Scanner.close(); // cerrar el objeto Scanner
            return; // salir del programa si el porcentaje es mayor a 100
        }

        /* calculo del salario bruto, retefuente y salario neto */
        horas_trabajadas = horas_trabajadas * 4; // horas trabajadas en el mes
        salario_bruto = calculos.salario_bruto(horas_trabajadas, valor_hora); // calculo del salario bruto
        retefuente = calculos.retefuente(salario_bruto, porcentaje_retefuente); // calculo de la retefuente
        salario_neto = calculos.salario_neto(salario_bruto, retefuente); // calculo del salario neto

        /* impresion de resultados */
        System.out.println("Salario Bruto: (mensual)" + salario_bruto);
        System.out.println("Retencion en la fuente: " + retefuente);
        System.out.println("Salario Neto: (mensual)" + salario_neto);
        Scanner.close(); // cerrar el objeto Scanner
    }
}
