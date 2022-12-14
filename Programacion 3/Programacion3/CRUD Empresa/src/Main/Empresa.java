package Main;

import View.ControllerVentana;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Empresa extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            //Cargo la vista
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Empresa.class.getResource("/View/ventana.fxml"));

            // Cargo la ventana
            Pane ventana = (Pane) loader.load();

            // Cargo el scene
            Scene scene = new Scene(ventana);

            // Seteo la scene y la muestro
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

}