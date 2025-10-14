/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_3;

/**
 *
 * @author daniel
 */
public class Piramide extends Figura{
    private double base; // base de la piramide
    private double altura; // altura de la piramide
    private double apotema; // apotema de la piramide

    public Piramide(double base, double altura, double apotema){ // constructor de la clase
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcular_volumen());
        this.setSuperficie(calcular_superficie());
    }
    
    public double calcular_volumen(){ // metodo que calcula el volumen del cilindro
        double volumen = (1/3) * Math.pow(base, 2) * altura;
        return volumen;
    }
    
    public double calcular_superficie(){ // metodo que calcula el area suuperficial del cilindro
        double area_base = Math.pow(base, 2); // area de la base de la piramide
        double area_lateral = 2 * base * apotema; // area lateral de la piramide
        double superficie = area_base + area_lateral; // area total de la piramide
        return superficie;
    }            
}
