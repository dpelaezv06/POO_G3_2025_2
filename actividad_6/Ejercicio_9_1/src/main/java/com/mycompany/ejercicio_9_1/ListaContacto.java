/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_9_1;

/**
 *
 * @author daniel
 */
import java.util.Vector;
public class ListaContacto {

    Vector lista;

    ListaContacto(){
        lista = new Vector();
    }

    void agregarContacto(Contacto contacto){
        lista.add(contacto);
    }
}
