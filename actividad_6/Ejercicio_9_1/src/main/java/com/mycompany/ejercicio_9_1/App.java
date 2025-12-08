package com.mycompany.ejercicio_9_1;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * JavaFX App
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {

        VentanaContacto ventana = new VentanaContacto();

        stage.setTitle("Ejercicio 9.1");
        stage.setScene(ventana.getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}