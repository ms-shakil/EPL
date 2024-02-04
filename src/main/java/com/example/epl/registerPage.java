package com.example.epl;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class registerPage {
    @FXML
    private TextField usernameText;
    @FXML
    private TextField emailText;
    @FXML
    private TextField passwordText;
    @FXML
    private TextField confirmPasswordText;
//    JSONObject  obj = new JSONObject();

    JSONArray dataArray = new JSONArray();
//    FileWriter file = new FileWriter("data.json");

    public registerPage() throws IOException {
    }

    @FXML
    public void registerAction (ActionEvent ignoredEvent) throws IOException{
//        JSONParser jsonParser = new JSONParser();//
        try{

            JSONParser jsonParser = new JSONParser();
            FileReader fileReader = new FileReader("data.json");
            Object obj = jsonParser.parse(fileReader);
            JSONArray  jsonArray = (JSONArray) obj;
            fileReader.close();
            FileWriter file;
            file = new FileWriter("data.json");
            JSONObject  obj1 = new JSONObject();
            obj1.put("UserName",usernameText.getText());
            obj1.put("Email",emailText.getText());
            obj1.put("PassWord",passwordText.getText());
            obj1.put("CpassWord",confirmPasswordText.getText());
            jsonArray.add(obj1);
            file.write(jsonArray.toJSONString());
            file.close();


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        //
//


        Main next_scene= new Main();
        next_scene.changeScene("loginPage.fxml");
    }
}
