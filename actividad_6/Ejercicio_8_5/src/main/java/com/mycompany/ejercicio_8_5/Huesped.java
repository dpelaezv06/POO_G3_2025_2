/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_5;
import java.util.*;

/**
 *
 * @author daniel
 */
public class Huesped {
    private String nombre;
    private String apellidos;
    private int documento_identificacion;
    private Date fecha_ingreso;
    private Date fecha_salida;

    public Huesped(String nombre, String apellidos, int documento_identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento_identificacion = documento_identificacion;
    }

    public int diasAlojamiento() {
        int dias = (int) ((fecha_salida.getTime() - fecha_ingreso.getTime()) / (1000 * 60 * 60 * 24)); // se divide por milisegundos, segundos, minutos y horas
        return dias;
    }   


    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

}
