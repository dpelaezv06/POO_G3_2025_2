/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto12;

/**
 *
 * @author daniel
 */
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

        /* asignacion de valores a las variables */
        horas_trabajadas = 48; // horas trabajadas en la semana
        valor_hora = 5000; // valor de la hora trabajada
        porcentaje_retefuente = 12; // porcentaje de la retefuente

        /* calculo del salario bruto, retefuente y salario neto */
        horas_trabajadas = horas_trabajadas * 4; // horas trabajadas en el mes
        salario_bruto = calculos.salario_bruto(horas_trabajadas, valor_hora); // calculo del salario bruto
        retefuente = calculos.retefuente(salario_bruto, porcentaje_retefuente); // calculo de la retefuente
        salario_neto = calculos.salario_neto(salario_bruto, retefuente); // calculo del salario neto

        /* impresion de resultados */
        System.out.println("Salario Bruto: " + salario_bruto);
        System.out.println("Retencion en la fuente: " + retefuente);
        System.out.println("Salario Neto: " + salario_neto);
    }
}
