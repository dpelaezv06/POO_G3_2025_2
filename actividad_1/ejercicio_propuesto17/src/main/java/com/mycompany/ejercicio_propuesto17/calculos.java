/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_propuesto17;

/**
 *
 * @author daniel
 */
public class calculos {
    static double area_circulo(double radio){
        /* metodo que permite calcular el area de un circulo segun su radio */
        double area; // variable que almacena el area del circulo
        area = Math.PI * Math.pow(radio, 2); // formula para calcular el area del circulo
        return area;
    }

    static double perimetro_circulo(double radio){
        /* metodo que permite calcular el perimetro de un circulo segun su radio */
        double perimetro; // variable que almacena el perimetro del circulo
        perimetro = 2 * Math.PI * radio; // formula para calcular el perimetro del circulo
        return perimetro;
    }

    static String comas_porPuntos(String entrada) {
        /* metodo para reemplazar las comas por puntos para que ambos seeparadores decimales sean aceptados */
        String salida;
        salida = entrada.replace(',', '.');
        return salida;
    }

    
}
