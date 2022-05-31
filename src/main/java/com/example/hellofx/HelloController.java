package com.example.hellofx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void up(ActionEvent e){
        System.out.println("UP");
    }
    public void down(ActionEvent e){
        System.out.println("DOWN");
    }
    public void right(ActionEvent e){
        System.out.println("RIGHT");
    }
    public void left(ActionEvent e){
        System.out.println("LEFT");
    }

}