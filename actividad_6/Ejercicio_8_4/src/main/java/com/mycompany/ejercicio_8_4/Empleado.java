/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_4;

/**
 *
 * @author daniel
 */
public class Empleado {
    
    /* lista de atributos que posee el objeto empleado */
    private String nombre; // nombre
    private String apellidos; // apellidos del empleado
    private double salario_diario; // salario que gana el emplado por dia
    private double otros_ingresos; // otros ingresos que podria tener el empleado
    private double pagos_salud; // pagos que realiza el empleado por salud
    private double aporte_pensiones; // aportes del empleado a pensiones
    private int dias_trabajados; // cantidad de ddias por mes que trabaja el empleado
    private TipoCargo cargo; // tipo de cargo que tiene el empleado
    private TipoGenero genero;

    public Empleado(String nombre, String apellidos, TipoCargo cargo, TipoGenero genero, double salario_diario, int dias_trabajados, double otros_ingresos, double pagos_salud, double aporte_pensiones) {
        /* el constructor de la clase pone todos los atributos en el objeto */
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.salario_diario = salario_diario;
        this.dias_trabajados = dias_trabajados;
        this.otros_ingresos = otros_ingresos;
        this.pagos_salud = pagos_salud;
        this.aporte_pensiones = aporte_pensiones;
        this.genero = genero;

    }

    public double calcularNomina(){
        /* metodo para calcular el pago de nomina de recibeb un empleado */
        double ingresos_brutos = (salario_diario * dias_trabajados) + otros_ingresos; // los ingresos brutos totales
        double deducciones = pagos_salud + aporte_pensiones; // las deducciones al salario
        double nomina_neta = ingresos_brutos - deducciones; // la nomina neta es la diferencia entre los ingresos y las deducciones
        return nomina_neta;
    }

    /* metodos get para obtener los atributos */

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public double getSalarioDiario(){
        return salario_diario;
    }

    public TipoCargo gerCargo(){
        return cargo;
    }

    public TipoGenero getGenero(){
        return genero;
    }

    public int getDiasTrabajados(){
        return dias_trabajados;
    }

    public double getOtrosIngresos(){
        return otros_ingresos;
    }

    public double getPagosSalud(){
        return pagos_salud;
    }

    public double getAportePensiones(){
        return aporte_pensiones;
    }


}
