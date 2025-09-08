/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_propuesto14;

/**
 *
 * @author daniel
 */
public class calculos {
    /* clase que contiene los metodos para obtener cuadrados y cubos de un numero */
    static double cuadrado(double numero) {
        /* metodo que devuelve el cuadrado de un numero */
        double cuadrado;
        cuadrado = Math.pow(numero, 2);
        return cuadrado;
    }

    static double cubo(double numero) {
        /* metodo que devuelve el cubo de un numero */
        double cubo;
        cubo = Math.pow(numero, 3);
        return cubo;
    }

    static String comas_porPuntos(String entrada) {
        /* metodo para reemplazar las comas por puntos para que ambos seeparadores decimales sean aceptados */
        String salida;
        salida = entrada.replace(',', '.');
        return salida;
    }
}
