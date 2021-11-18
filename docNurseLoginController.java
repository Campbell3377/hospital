package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class docNurseLoginController implements Initializable
{
    @FXML
    private Button nurseLogin;
    @FXML
    private Button docLogin;
    @FXML
    private Button home;

    @FXML
    private void docAction(ActionEvent event)
    {
        try
        {
            Parent page = FXMLLoader.load(getClass().getResource("Docportal.fxml"));
            Scene scene = new Scene(page);
            Stage stage = (Stage) (docLogin.getScene().getWindow());
            stage.setScene(scene);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void nurseAction(ActionEvent event)
    {
        try
        {
            Parent page = FXMLLoader.load(getClass().getResource("Nurseportal.fxml"));
            Scene scene = new Scene(page);
            Stage stage = (Stage) (nurseLogin.getScene().getWindow());
            stage.setScene(scene);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleHome(ActionEvent event)
    {
        try
        {
            Parent page = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Scene scene = new Scene(page);
            Stage stage = (Stage) (home.getScene().getWindow());
            stage.setScene(scene);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

