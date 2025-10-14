/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_3;

/**
 *
 * @author daniel
 */
public class Esfera extends Figura{
    private double radio; // radio de la esfera

    public Esfera(double radio){ // constructor de la clase
        this.radio = radio;
        this.setVolumen(calcular_volumen());
        this.setSuperficie(calcular_superficie());
    }
    
    public double calcular_volumen(){ // metodo que calcula el volumen del cilindro
        double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
        return volumen;
    }
    
    public double calcular_superficie(){ // metodo que calcula el area suuperficial del cilindro
        double superficie = 4 * Math.PI * Math.pow(radio, 2); // area de la superficie de la esfera
        return superficie;
    }        

}
