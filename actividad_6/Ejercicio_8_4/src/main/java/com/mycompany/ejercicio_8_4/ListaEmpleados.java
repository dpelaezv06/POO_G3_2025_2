/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_4;

/**
 *
 * @author daniel
 */

import java.util.*; // es necesario importar la libreria util para usar vectores

public class ListaEmpleados {
    public Vector lista; // vector que contiene la lista de empleados
    public double total_nomina = 0; // total de la nomina de todos los empleados
    
    public ListaEmpleados(){
        /* constructor de la clase que iniciaaliza el vector */
        lista = new Vector();
    }

    public void agregarEmpleado(Empleado nuevoEmpleado){
        /* metodo para agregar un nuevo empleado a la lista */
        lista.add(nuevoEmpleado);
    }

    public double calcularNominaTotal(){
        for (int counter  = 0; counter < lista.size(); counter++){
            Empleado empleado_actual = (Empleado) lista.elementAt(counter); // obtiene el empleado actual
            total_nomina += empleado_actual.calcularNomina(); // suma la nomina del empleado actual al total
        }
        return total_nomina; // retorna el valor de la nomina 
    }

    public String[][] obtenerMatriz(){
        /* metodo que calcula la nomina total y retorna una matriz con la lista de empleados identificados por su nombre, su apelido y su respectiva nomina */
        String datos[][] = new String[lista.size()][3]; // crea una matriz de tamaño n x 3 donde n es la cantidad de empleados
        for (int counter = 0; counter < lista.size(); counter++){
            Empleado empleado_actual = (Empleado) lista.elementAt(counter); // obtiene el empleado actual
            datos[counter][0] = empleado_actual.getNombre(); // obtiene el nombre del empleado
            datos[counter][1] = empleado_actual.getApellidos(); // obtiene los apellidos del
            datos[counter][2] = Double.toString(empleado_actual.calcularNomina()); // obtiene la nomina del empleado
            total_nomina += empleado_actual.calcularNomina(); // suma la nomina del empleado actual al total
        }
        return datos; // retorna la matriz con los datos de los empleados
    }


}
