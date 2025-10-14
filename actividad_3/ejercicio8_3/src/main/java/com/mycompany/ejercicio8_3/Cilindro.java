/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_3;

/**
 *
 * @author daniel
 */
public class Cilindro extends Figura{
    private double radio; // radio de la base del cilindro
    private double altura; // altura del cilindro
    
    public Cilindro(double radio, double altura){ // constructor de la clase
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcular_volumen());
        this.setSuperficie(calcular_superficie());
    }
    
    public double calcular_volumen(){ // metodo que calcula el volumen del cilindro
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }
    
    public double calcular_superficie(){ // metodo que calcula el area suuperficial del cilindro
        double superficie_bases = Math.PI * Math.pow(radio, 2) * 2; // area de la superficie de la 2 tapas del cilindro
        double superficie_lateral = 2 * Math.PI * radio * altura; // area lateral del cilindro
        double superficie = superficie_bases + superficie_lateral; // el area superficial es la suma del area de las tapas y del area lateral
        return superficie;
    }        
}
