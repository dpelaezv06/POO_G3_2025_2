/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_5;

/**
 *
 * @author daniel
 */
public class Habitacion {
    private int numero_habitacion;
    private boolean disponible;
    private double precio_dia;
    private Huesped huesped;

    public Habitacion(int numero_habitacion, boolean disponible, double precio_dia) {
        this.numero_habitacion = numero_habitacion;
        this.disponible = disponible;
        this.precio_dia = precio_dia;
    }

    public int getNumeroHabitacion() {
        return numero_habitacion;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public double getPrecioDia() {
        return precio_dia;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
    
}
