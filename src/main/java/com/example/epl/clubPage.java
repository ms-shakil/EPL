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

public class clubPage implements Initializable {
    @FXML
    private Button arsenalButton;
    public void aresenalButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button brentfordButton;
    public void brentfordButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button bournemouthButton;
    public void bournemouthButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button astonVillaButton;
    public void astonVillaButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button chelseaButton;
    public void chelseaButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button crystalPalaceButton;
    public void crystalPalaceButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button evertonButton;
    public void evertonButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button fulhumButton;
    public void fulhumButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button leedsUnitedButton;
    public void leedsUnitedButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button leicesterCityButton;
    public void leicesterCityButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button liverpoolButton;
    public void liverpoolButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button manchesterUnitedButton;
    public void manchesterUnitedButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button manchesterCityButton;
    public void manchesterCityButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button tottenhumButton;
    public void tottenhumButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private Button westhumButton;
    public void westhumButtonAction(ActionEvent Event) throws IOException{
        Main next_scene= new Main();
        next_scene.changeScene("playerPage.fxml");
    }
    @FXML
    private ImageView arsenal;
    @FXML
    private ImageView brentford;
    @FXML
    private ImageView bournemouth;
    @FXML
    private ImageView astonVilla;
    @FXML
    private ImageView chelsea;
    @FXML
    private ImageView crystalPalace;
    @FXML
    private ImageView everton;
    @FXML
    private ImageView fulhum;
    @FXML
    private ImageView leedsUnited;
    @FXML
    private ImageView leicesterCity;
    @FXML
    private ImageView liverpool;
    @FXML
    private ImageView manchesterUnited;
    @FXML
    private ImageView tottenhum;
    @FXML
    private ImageView westhum;
    @FXML
    private ImageView manchesterCity;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File arc= new File("@../../../../../../Image/arsenal.PNG");
        Image arcImage= new Image(arc.toURI().toString());
        arsenal.setImage(arcImage);

        File bre= new File("@../../../../../../Image/brentford.PNG");
        Image breImage= new Image(bre.toURI().toString());
        brentford.setImage(breImage);

        File bou= new File("@../../../../../../Image/bournemount.PNG");
        Image bouImage= new Image(bou.toURI().toString());
        bournemouth.setImage(bouImage);

        File ast= new File("@../../../../../../Image/aston_vila.PNG");
        Image astImage= new Image(ast.toURI().toString());
        astonVilla.setImage(astImage);

        File che= new File("@../../../../../../Image/chelsea.PNG");
        Image cheImage= new Image(che.toURI().toString());
        chelsea.setImage(cheImage);

        File cry= new File("@../../../../../../Image/cristal_palace.PNG");
        Image cryImage= new Image(cry.toURI().toString());
        crystalPalace.setImage(cryImage);

        File eve= new File("@../../../../../../Image/Everton.PNG");
        Image eveImage= new Image(eve.toURI().toString());
        everton.setImage(eveImage);

        File ful= new File("@../../../../../../Image/fulhum.PNG");
        Image fulImage= new Image(ful.toURI().toString());
        fulhum.setImage(fulImage);

        File lee= new File("@../../../../../../Image/leads_united.PNG");
        Image leeImage= new Image(lee.toURI().toString());
        leedsUnited.setImage(leeImage);

        File lei= new File("@../../../../../../Image/leister_city.PNG");
        Image leiImage= new Image(lei.toURI().toString());
        leicesterCity.setImage(leiImage);

        File liv= new File("@../../../../../../Image/liverpool.PNG");
        Image livImage= new Image(liv.toURI().toString());
        liverpool.setImage(livImage);

        File manu= new File("@../../../../../../Image/Manchater.PNG");
        Image manuImage= new Image(manu.toURI().toString());
        manchesterUnited.setImage(manuImage);

        File tot= new File("@../../../../../../Image/totenhum.PNG");
        Image totImage= new Image(tot.toURI().toString());
        tottenhum.setImage(totImage);

        File wes= new File("@../../../../../../Image/westhum.PNG");
        Image wesImage= new Image(wes.toURI().toString());
        westhum.setImage(wesImage);

        File manc= new File("@../../../../../../Image/Mancity.PNG");
        Image mancImage= new Image(manc.toURI().toString());
        manchesterCity.setImage(mancImage);
    }
}
