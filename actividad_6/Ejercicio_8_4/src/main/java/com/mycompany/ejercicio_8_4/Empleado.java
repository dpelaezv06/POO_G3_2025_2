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

    public double calcularNomina(){
        double ingresos_brutos = (salario_diario * dias_trabajados) + otros_ingresos;
        double deducciones = pagos_salud + aporte_pensiones;
        double nomina_neta = ingresos_brutos - deducciones;
        return nomina_neta;
    }




}
