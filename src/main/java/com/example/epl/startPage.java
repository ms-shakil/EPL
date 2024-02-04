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

public class startPage implements Initializable {
   @FXML
   private Button startButton;

   @FXML
   private ImageView startingImageView;

   public void startButtonAction (ActionEvent event) throws IOException {
      Main next_scene= new Main();
      next_scene.changeScene("loginPage.fxml");
   }

   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
      File loginFile= new File("@../../../../../../Image/Capture.PNG");
      Image loginImage= new Image(loginFile.toURI().toString());
      startingImageView.setImage(loginImage);
   }
}