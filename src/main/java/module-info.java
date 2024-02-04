module com.example.epl {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.epl to javafx.fxml;
    exports com.example.epl;
}