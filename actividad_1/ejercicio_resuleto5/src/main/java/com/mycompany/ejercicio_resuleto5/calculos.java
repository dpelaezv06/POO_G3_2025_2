/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_resuleto5;

/**
 *
 * @author daniel
 */
public class calculos {
    
    static double sumar(double suma, double x){
        /* metodo para reaizar la suma de dos numeros */
        double resultado = suma + x;
        return resultado;
    }

    static double calcular_x(double x, double y){
        /* metodo para calcular el valor de x */
        double resultado = x + Math.pow(y, 2); // se calcula el valor de x
        return resultado;
    }
}
