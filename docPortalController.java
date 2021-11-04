package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class docPortalController implements Initializable {

    @FXML
    private Button home;
    @FXML
    private Button patients;
    @FXML
    private Button appointments;
    @FXML
    private Button info;
    @FXML
    private Button contact;

    @FXML
    private void handleHome(ActionEvent event)
    {
        try
        {
            AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getResource("homepage.fxml"));
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
