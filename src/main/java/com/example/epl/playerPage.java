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

public class playerPage implements Initializable {
    @FXML
    private ImageView ben;
    @FXML
    private  ImageView kavani;
    @FXML
    private  ImageView coleman;
    @FXML
    private  ImageView cork;
    @FXML
    private  ImageView denis;
    @FXML
    private  ImageView edson;
    @FXML
    private  ImageView filipes;
    @FXML
    private  ImageView foden;
    @FXML
    private  ImageView gabriels;
    @FXML
    private  ImageView gea;
    @FXML
    private  ImageView hakims;
    @FXML
    private  ImageView harrys;
    @FXML
    private  ImageView hugos;
    @FXML
    private  ImageView jamess;
    @FXML
    private  ImageView jans;
    @FXML
    private  ImageView joaos;
    @FXML
    private  ImageView joels;
    @FXML
    private  ImageView krafths;
    @FXML
    private  ImageView kompanys;
    @FXML
    private  ImageView kevins;
    @FXML
    private  ImageView kyles;
    @FXML
    private  ImageView kanes;
    @FXML
    private  ImageView lemars;
    @FXML
    private  ImageView kylians;
    @FXML
    private  ImageView lukakus;
    @FXML
    private  ImageView majids;
    @FXML
    private  ImageView morenos;
    @FXML
    private  ImageView pedros;
    @FXML
    private  ImageView perisics;
    @FXML
    private  ImageView popes;
    @FXML
    private  ImageView raheems;
    @FXML
    private  ImageView rashfords;
    @FXML
    private  ImageView rodrigos;
    @FXML
    private  ImageView samans;
    @FXML
    private  ImageView sidibes;
    @FXML
    private  ImageView sons;
    @FXML
    private  ImageView willians;
    @FXML
    private  ImageView silvas;
    @FXML
    private  ImageView yuengs;
    @FXML
    private  ImageView pascal;
    @FXML
    private  ImageView julians;
    @FXML
    private ImageView fabianskis;



    @FXML
    private Button kavaniButton;
    @FXML
    private Button benButton;
    @FXML
    private Button colemanButton;
    public void benButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("ben.fxml");
    }
    public void kavaniButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("kavani.fxml");
    }
    public void colemanButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("coleman.fxml");
    }
    public void corkButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("cork.fxml");
    }
    public void denisButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("denis.fxml");
    }
    public void edsonButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("edson.fxml");
    }
    public void fabianskisButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("fabianskis.fxml");
    }
    public void filipesButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("filipes.fxml");
    }
    public void fodenButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("foden.fxml");
    }
    public void gabrielsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("gabriels.fxml");
    }
    public void geaButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("gea.fxml");
    }
    public void hakimsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("hakims.fxml");
    }
    public void harrysButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("harrys.fxml");
    }
    public void hugosButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("hugos.fxml");
    }
    public void jamessButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("jamess.fxml");
    }
    public void jansButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("jans.fxml");
    }
    public void joaosButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("joaos.fxml");
    }
    public void joelsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("joels.fxml");
    }
    public void krafthsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("krafths.fxml");
    }
    public void kompanysButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("kompanys.fxml");
    }
    public void kevinsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("kevins.fxml");
    }
    public void kylesButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("kyles.fxml");
    }
    public void kanesButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("kanes.fxml");
    }
    public void lemarsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("lemars.fxml");
    }
    public void kyliansButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("kylians.fxml");
    }
    public void lukakusButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("kavani.fxml");
    }
    public void majidsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("majids.fxml");
    }
    public void morenosButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("morenos.fxml");
    }
    public void pedrosButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("pedros.fxml");
    }
    public void perisicsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("perisics.fxml");
    }
    public void popesButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("popes.fxml");
    }
    public void raheemsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("raheems.fxml");
    }
    public void rashfordsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("rashfords.fxml");
    }
    public void rodrigosButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("rodrigos.fxml");
    }
    public void samansButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("samans.fxml");
    }
    public void sidibesButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("sidibes.fxml");
    }
    public void sonsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("sons.fxml");
    }
    public void williansButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("willians.fxml");
    }
    public void silvasButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("silvas.fxml");
    }
    public void yuengsButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("yuengs.fxml");
    }
    public void pascalButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("pascal.fxml");
    }
    public void juliansButton(ActionEvent event) throws IOException {
        Main next_scene= new Main();
        next_scene.changeScene("julians.fxml");
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File benFile= new File("@../../../../../../Image/bens.png");
        Image benImage= new Image(benFile.toURI().toString());
        ben.setImage(benImage);

        File kavaniFile= new File("@../../../../../../Image/cavanis.png");
        Image kavaniImage= new Image(kavaniFile.toURI().toString());
        kavani.setImage(kavaniImage);

        File colemanFile= new File("@../../../../../../Image/colemans.png");
        Image colemanImage= new Image(colemanFile.toURI().toString());
        coleman.setImage(colemanImage);

        File corkFile= new File("@../../../../../../Image/corks.png");
        Image corkImage= new Image(corkFile.toURI().toString());
        cork.setImage(corkImage);

        File denisFile= new File("@../../../../../../Image/deniss.png");
        Image denisImage= new Image(denisFile.toURI().toString());
        denis.setImage(denisImage);

        File edsonFile= new File("@../../../../../../Image/edsons.png");
        Image edsonImage= new Image(edsonFile.toURI().toString());
        edson.setImage(edsonImage);

        File fabianskisFile= new File("@../../../../../../Image/fabianskis.png");
        Image fabianskisImage= new Image(fabianskisFile.toURI().toString());
        fabianskis.setImage(fabianskisImage);

        File filipesFile= new File("@../../../../../../Image/filipes.png");
        Image filipesImage= new Image(filipesFile.toURI().toString());
        filipes.setImage(filipesImage);

        File fodenFile= new File("@../../../../../../Image/fodens.png");
        Image fodenImage= new Image(fodenFile.toURI().toString());
        foden.setImage(fodenImage);

        File gabrielsFile= new File("@../../../../../../Image/gabriels.png");
        Image gabrielsImage= new Image(gabrielsFile.toURI().toString());
        gabriels.setImage(gabrielsImage);

        File geaFile= new File("@../../../../../../Image/geas.png");
        Image geaImage= new Image(geaFile.toURI().toString());
        gea.setImage(geaImage);

        File hakimsFile= new File("@../../../../../../Image/hakims.png");
        Image hakimsImage= new Image(hakimsFile.toURI().toString());
        hakims.setImage(hakimsImage);

        File harrysFile= new File("@../../../../../../Image/harrys.png");
        Image harrysImage= new Image(harrysFile.toURI().toString());
        harrys.setImage(harrysImage);

        File hugosFile= new File("@../../../../../../Image/hugos.png");
        Image hugosImage= new Image(hugosFile.toURI().toString());
        hugos.setImage(hugosImage);

        File jamessFile= new File("@../../../../../../Image/jamess.png");
        Image jamessImage= new Image(jamessFile.toURI().toString());
        jamess.setImage(jamessImage);

        File jansFile= new File("@../../../../../../Image/jans.png");
        Image jansImage= new Image(jansFile.toURI().toString());
        jans.setImage(jansImage);

        File joaosFile= new File("@../../../../../../Image/joaos.png");
        Image joaosImage= new Image(joaosFile.toURI().toString());
        joaos.setImage(joaosImage);

        File joelsFile= new File("@../../../../../../Image/joels.png");
        Image joelsImage= new Image(joelsFile.toURI().toString());
        joels.setImage(joelsImage);

        File juliansFile= new File("@../../../../../../Image/julians.png");
        Image juliansImage= new Image(juliansFile.toURI().toString());
        julians.setImage(juliansImage);

        File kanesFile= new File("@../../../../../../Image/kanes.png");
        Image kanesImage= new Image(kanesFile.toURI().toString());
        kanes.setImage(kanesImage);

        File kevinsFile= new File("@../../../../../../Image/kevins.png");
        Image kevinsImage= new Image(kevinsFile.toURI().toString());
        kevins.setImage(kevinsImage);

        File kompanysFile= new File("@../../../../../../Image/kompanys.png");
        Image kompanysImage= new Image(kompanysFile.toURI().toString());
        kompanys.setImage(kompanysImage);

        File krafthsFile= new File("@../../../../../../Image/krafths.png");
        Image krafthsImage= new Image(krafthsFile.toURI().toString());
        krafths.setImage(krafthsImage);

        File kylesFile= new File("@../../../../../../Image/kyles.png");
        Image kylesImage= new Image(kylesFile.toURI().toString());
        kyles.setImage(kylesImage);

        File kyliansFile= new File("@../../../../../../Image/kylians.png");
        Image kyliansImage= new Image(kyliansFile.toURI().toString());
        kylians.setImage(kyliansImage);

        File lemarsFile= new File("@../../../../../../Image/lemars.png");
        Image lemarsImage= new Image(lemarsFile.toURI().toString());
        lemars.setImage(lemarsImage);

        File lukakusFile= new File("@../../../../../../Image/lukakus.png");
        Image lukakusImage= new Image(lukakusFile.toURI().toString());
        lukakus.setImage(lukakusImage);

        File majidsFile= new File("@../../../../../../Image/majids.png");
        Image majidsImage= new Image(majidsFile.toURI().toString());
        majids.setImage(majidsImage);

        File morenosFile= new File("@../../../../../../Image/morenos.png");
        Image morenosImage= new Image(morenosFile.toURI().toString());
        morenos.setImage(morenosImage);

        File pascalFile= new File("@../../../../../../Image/pascal.png");
        Image pascalImage= new Image(pascalFile.toURI().toString());
        pascal.setImage(pascalImage);

        File pedrosFile= new File("@../../../../../../Image/pedros.png");
        Image pedrosImage= new Image(pedrosFile.toURI().toString());
        pedros.setImage(pedrosImage);

        File perisicsFile= new File("@../../../../../../Image/perisics.png");
        Image perisicsImage= new Image(perisicsFile.toURI().toString());
        perisics.setImage(perisicsImage);

        File popesFile= new File("@../../../../../../Image/popes.png");
        Image popesImage= new Image(popesFile.toURI().toString());
        popes.setImage(popesImage);

        File raheemsFile= new File("@../../../../../../Image/raheems.png");
        Image raheemsImage= new Image(raheemsFile.toURI().toString());
        raheems.setImage(raheemsImage);

        File rashfordsFile= new File("@../../../../../../Image/rashfords.png");
        Image rashfordsImage= new Image(rashfordsFile.toURI().toString());
        rashfords.setImage(rashfordsImage);

        File rodrigosFile= new File("@../../../../../../Image/rodrigos.png");
        Image rodrigosImage= new Image(rodrigosFile.toURI().toString());
        rodrigos.setImage(rodrigosImage);

        File samansFile= new File("@../../../../../../Image/samans.png");
        Image samansImage= new Image(samansFile.toURI().toString());
        samans.setImage(samansImage);

        File sidibesFile= new File("@../../../../../../Image/sidibes.png");
        Image sidibesImage= new Image(sidibesFile.toURI().toString());
        sidibes.setImage(sidibesImage);

        File silvasFile= new File("@../../../../../../Image/silvas.png");
        Image silvasImage= new Image(silvasFile.toURI().toString());
        silvas.setImage(silvasImage);

        File sonsFile= new File("@../../../../../../Image/sons.png");
        Image sonsImage= new Image(sonsFile.toURI().toString());
        sons.setImage(sonsImage);

        File williansFile= new File("@../../../../../../Image/willians.png");
        Image williansImage= new Image(williansFile.toURI().toString());
        willians.setImage(williansImage);

        File yuengsFile= new File("@../../../../../../Image/yuengs.png");
        Image yuengsImage= new Image(yuengsFile.toURI().toString());
        yuengs.setImage(yuengsImage);

    }
}
