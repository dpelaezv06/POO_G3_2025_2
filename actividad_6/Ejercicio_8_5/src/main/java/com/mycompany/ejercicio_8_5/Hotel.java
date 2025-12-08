/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_5;
import java.util.*;
import java.text.*;

/**
 *
 * @author daniel
 */
public class Hotel {
    public static Vector<Habitacion> lista_habitaciones;

    public Hotel(){
        lista_habitaciones = new Vector<Habitacion>();

        Habitacion habitacion1 = new Habitacion(1, true, 120000);
        Habitacion habitacion2 = new Habitacion(2, true, 120000);
        Habitacion habitacion3 = new Habitacion(3, true, 120000);
        Habitacion habitacion4 = new Habitacion(4, true, 120000);
        Habitacion habitacion5 = new Habitacion(5, true, 120000);
        Habitacion habitacion6 = new Habitacion(6, true, 120000);
        Habitacion habitacion7 = new Habitacion(7, true, 120000);
        Habitacion habitacion8 = new Habitacion(8, true, 120000);
        Habitacion habitacion9 = new Habitacion(9, true, 120000);
        Habitacion habitacion10 = new Habitacion(10, true, 120000);

        lista_habitaciones.add(habitacion1);
        lista_habitaciones.add(habitacion2);
        lista_habitaciones.add(habitacion3);
        lista_habitaciones.add(habitacion4);
        lista_habitaciones.add(habitacion5);
        lista_habitaciones.add(habitacion6);
        lista_habitaciones.add(habitacion7);
        lista_habitaciones.add(habitacion8);
        lista_habitaciones.add(habitacion9);
        lista_habitaciones.add(habitacion10);
    }

    public String buscarFechaIngresoHabitacion(int numero_habitacion){
        for (int counter = 0; counter <= lista_habitaciones.size(); counter++){
            Habitacion habitacion_actual = lista_habitaciones.elementAt(counter);

            if (habitacion_actual.getNumeroHabitacion() == numero_habitacion){
                Date fecha_ingreso = habitacion_actual.getHuesped().getFecha_ingreso();
                DateFormat formato_fecha = new SimpleDateFormat("yyyy/MM/dd");
                String fecha = formato_fecha.format(fecha_ingreso);
                return fecha;
            }
                        
        }

        return "";
    }

    public boolean buscarHabitacionOcupada(int numero_habitacion){
        for (int counter = 0; counter < lista_habitaciones.size(); counter++){
            Habitacion habitacion_actual = lista_habitaciones.elementAt(counter);

            if (habitacion_actual.getNumeroHabitacion() == numero_habitacion && !habitacion_actual.getDisponible()){
                return true;
            }
                        
        }

        return false;
    }

    
}
