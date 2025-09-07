/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_propuesto12;

/**
 *
 * @author daniel
 */
public class calculos {
    /* clase que contiene los metodos para calcular el salario bruto, retefuente y salario neto */
    static double salario_bruto(double horas_trabajadas, double valor_hora){
        /* metodo que caulcula el salario bruto */
        double salario_bruto; // variable que almacena el salario bruto
        salario_bruto = horas_trabajadas * valor_hora; // calculo del salario bruto
        return salario_bruto;
    }

    static double retefuente(double salario_bruto, double porcentaje_retefuente){
        /* metodo que calcula el valor de la retefuente */
        double retefuente; // variable que almacena el valor de la retefuente
        retefuente = salario_bruto * (porcentaje_retefuente / 100); // calculo de la retefuente
        return retefuente;
    }

    static double salario_neto(double salario_bruto, double retefuente){
        /* metodo que calcula el salario neto */
        double salario_neto; // variable que almacena el salario neto
        salario_neto = salario_bruto - retefuente; // calculo del salario neto
        return salario_neto;
    }    
}
