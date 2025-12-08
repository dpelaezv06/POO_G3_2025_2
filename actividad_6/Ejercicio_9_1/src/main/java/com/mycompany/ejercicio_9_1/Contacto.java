/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_9_1;

import java.time.LocalDate;

/**
 *
 * @author daniel
 */
public class Contacto {
    String nombres;
    String apellidos;
    LocalDate fechaNacimiento;
    String direccion;
    String telefono;
    String correoElectronico;

    Contacto(String nombres, String apellidos, LocalDate fechaNacimiento, String direccion, String telefono, String correoElectronico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    
}
