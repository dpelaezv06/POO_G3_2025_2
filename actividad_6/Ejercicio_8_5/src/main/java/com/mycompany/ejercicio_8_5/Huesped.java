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

    public Huesped(String nombre, String apellidos, int documento_identificacion, Date fecha_ingreso, Date fecha_salida) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento_identificacion = documento_identificacion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDocumento_identificacion() {
        return documento_identificacion;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDocumento_identificacion(int documento_identificacion) {
        this.documento_identificacion = documento_identificacion;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

}
