/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_9_1;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author daniel
 */

public class VentanaContacto extends Application {
    Label nombres = new Label("Nombres: ");
    Label apellidos = new Label("Apellidos: ");
    Label fechaNacimiento = new Label("Fecha de nacimiento: ");
    Label direccion = new Label("Dirección: ");
    Label correoElectronico = new Label("Correo electrónico: ");
    Label telefono = new Label("Teléfono: ");

    TextField campoNombres = new TextField();
    TextField campoApellidos = new TextField();
    DatePicker campoFechaNacimiento = new DatePicker();
    TextField campoDireccion = new TextField();
    TextField campoCorreoElectronico = new TextField();
    TextField campoTelefono = new TextField();
    ListView lista = new ListView();

    Button botonAgregar = new Button("Agregar");

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.add(nombres, 0, 0);
        grid.add(apellidos, 0, 1);
        grid.add(fechaNacimiento, 0, 2);
        grid.add(direccion, 0, 3);
        grid.add(telefono, 0, 4);
        grid.add(correoElectronico, 0, 5);
        grid.add(campoNombres, 1, 0);
        grid.add(campoApellidos, 1, 1);
        grid.add(campoFechaNacimiento, 1, 2);
        grid.add(campoDireccion, 1, 3);
        grid.add(campoTelefono, 1, 4);
        grid.add(campoCorreoElectronico, 1, 5);
        grid.add(lista, 2, 0, 1, 7);
        VBox buttonBox = new VBox(botonAgregar);
        botonAgregar.setMaxWidth(Double.MAX_VALUE);
        grid.add(buttonBox, 0, 6, 1, 2);
        botonAgregar.setOnAction(e -> mostrarDatos());
    }

    private void mostrarDatos(){
        String nombre = campoNombres.getText();
        String apellido = campoApellidos.getText();
        LocalDate fechaNacimiento = campoFechaNacimiento.getValue();
        String direccion = campoDireccion.getText();
        String telefono = campoTelefono.getText();
        String correoElectronico = campoCorreoElectronico.getText();

        if (nombre.equals("") || apellido.equals("") || direccion.equals("") || telefono.equals("") || correoElectronico.equals("")){
            Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
            mensaje.setTitle("Mensaje");
            mensaje.setHeaderText("Error en el ingreso de los datos");
            mensaje.setContentText("Por favor, complete todos los campos.");
            mensaje.showAndWait();
            
        }else{
            Contacto contacto = new Contacto(nombre, apellido, fechaNacimiento, direccion, telefono, correoElectronico);
            lista.getItems().add(contacto);
            ListaContacto listaContactos = new ListaContacto();
            listaContactos.agregarContacto(contacto);
            String datos = nombre + "-" + apellido + "-" + fechaNacimiento + "-" + direccion + "-" + telefono + "-" + correoElectronico;
            lista.getItems().add(datos);

            campoNombres.setText("");
            campoApellidos.setText("");
            campoFechaNacimiento.setValue(null);
            campoDireccion.setText("");
            campoTelefono.setText("");
            campoCorreoElectronico.setText("");

        }

        
    }
    


    
    
}
