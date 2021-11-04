package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class createPatientController implements Initializable {

    @FXML
    private TextField dob;
    @FXML
    private TextField sex;
    @FXML
    private TextField height;
    @FXML
    private TextField weight;
    @FXML
    private Button create;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
