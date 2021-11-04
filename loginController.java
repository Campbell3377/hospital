package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Button;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loginController implements Initializable {

    @FXML
    private Button home;
    @FXML
    private Button newPatient;
    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    private void handleHome(ActionEvent event)
    {
        try
        {
            AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Stage stage = (Stage) (home.getScene().getWindow());
            stage.getScene().setRoot(page);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleLogin(ActionEvent event)
    {
        try
        {
            AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getResource("patientportal.fxml"));
            Stage stage = (Stage) (login.getScene().getWindow());
            stage.getScene().setRoot(page);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
