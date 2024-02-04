package com.example.epl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    private static  Stage copyStage;
    @Override
    public void start(Stage stage) throws IOException {
        //JSONObject obj = new  JSONObject();
        copyStage=stage;
        Parent root = FXMLLoader.load(getClass().getResource("startPage.fxml"));
        Scene scene = new Scene(root, 600,400);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        copyStage.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}