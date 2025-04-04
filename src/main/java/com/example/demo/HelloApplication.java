package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PaginaPrincipal.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);

        stage.setTitle("Área de Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        stage.centerOnScreen();
    }

    public static void main(String[] args) {
        launch();
    }
}
