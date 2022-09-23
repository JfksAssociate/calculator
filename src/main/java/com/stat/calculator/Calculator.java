package com.stat.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator extends Application {
    public static Calculator instance;
    public Stage stageMain;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calculator.class.getResource("hello-view.fxml"));
        instance = this;
        Scene scene = new Scene(fxmlLoader.load(), 380, 560);
        stageMain = stage;
        stage.setTitle("Factorial Calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}