package com.stat.calculator;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField screen;

    @FXML
    protected void onButtonClick() {
        Calculator.instance.stageMain.close();
    }
    @FXML
    protected void onNumPressed(Event event) {
        screen.setText(((Button)event.getSource()).getText());
    }
}