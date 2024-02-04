package com.example.epl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginPage implements Initializable {
    @FXML
    private Button registerButton;


    public void registerButtonAction(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("registerPage.fxml");
    }

    @FXML
    private Button loginButton;
    @FXML
    private TextField loginUserNameText;
    @FXML
    private TextField loginPasswordText;

    public void loginButtonAction(ActionEvent event) throws IOException {
        JSONParser jsonParser = new JSONParser();
        String S1 = loginUserNameText.getText();
        String S2 = loginPasswordText.getText();
        try(FileReader fileReader = new FileReader("data.json")){
            Object obj = jsonParser.parse(fileReader);
            JSONArray  jsonArray = (JSONArray) obj;

            for(int i = 0;i< jsonArray.size();i++){
                JSONObject obj2 = (JSONObject)jsonArray.get(i);
                String name = (String) obj2.get("UserName");
                String email = (String) obj2.get("Email");
                String cpass = (String) obj2.get("CpassWord");
                String pass = (String) obj2.get("PassWord");
                if(S1.equals(name) && S2.equals(pass)){
                    Main next_scene= new Main();
                    next_scene.changeScene("clubPage.fxml");
                }

            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
    @FXML
    private Button cancelButton;
    public void cancelButtonAction(ActionEvent event) throws IOException{
        Stage stage= (Stage) cancelButton.getScene().getWindow();
        stage.close();;
    }

    @FXML
    private ImageView loginImageView;
    @FXML
    private ImageView loginlogo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File loginFile= new File("@../../../../../../Image/logo.PNG");
        Image loginImage= new Image(loginFile.toURI().toString());
        loginImageView.setImage(loginImage);

        File logoFile= new File("@../../../../../../Image/logo3.PNG");
        Image logoImage= new Image(logoFile.toURI().toString());
        loginlogo.setImage(logoImage);
    }
}