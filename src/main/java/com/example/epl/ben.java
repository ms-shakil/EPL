package com.example.epl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ben implements Initializable {
    @FXML
    private Button contract;

    public void contractButtonAction (ActionEvent event) throws IOException{
        System.out.println("Welcome to my team");
    }
    @FXML
    private ImageView ben;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File benFile= new File("@../../../../../../Image/Ben_Davies.PNG");
        Image benImage= new Image(benFile.toURI().toString());
        ben.setImage(benImage);
    }
}
