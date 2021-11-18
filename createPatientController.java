package sample;

import database.DatabaseHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class createPatientController implements Initializable {

    @FXML
    private TextField age;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField patId;
    @FXML
    private Button create;
    @FXML
    private TextField password;
    @FXML
    private TextField phoneNum;

    DatabaseHandler handler;

    @FXML
    private void createPatient(ActionEvent event)
    {
        int ages = Integer.parseInt(age.getText());
        String firstN = firstName.getText();
        String lastN = lastName.getText();
        int patID = Integer.parseInt(patId.getText());
        String phoneN = phoneNum.getText();


        String query = "insert into 'patientTable' (patId, age, firstN, lastN, phoneN) values (" +
                "'" + patID + "'," +
                "'" + ages + "'," +
                "'" + firstN + "'," +
                "'" + lastN + "'," +
                "'" + phoneN + "'" + ")";
        System.out.println(query);

        if (handler.execAction(query))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Success");
            alert.showAndWait();
        } else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Failed");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        handler = DatabaseHandler.getInstance();
    }
}
