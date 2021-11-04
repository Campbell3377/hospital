/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author seanc
 */

package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;  
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class homeController implements Initializable {
    
    @FXML
    private Button nursedoc;
    @FXML
    private Button patient;
    @FXML
    private Button staff;
    
    @FXML
    private void handleNurseDoc(ActionEvent event) {
        try
        {
            AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getResource("Doc_nurse.fxml"));
            Stage stage = (Stage) (nursedoc.getScene().getWindow());
            stage.getScene().setRoot(page);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handlePatient(ActionEvent event)
    {
        try
        {
            AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getResource("Login.fxml"));
            Stage stage = (Stage) (patient.getScene().getWindow());
            stage.getScene().setRoot(page);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleStaff(ActionEvent event)
    {
        try
        {
            AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getResource("staff.fxml"));
            Stage stage = (Stage) (nursedoc.getScene().getWindow());
            stage.getScene().setRoot(page);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { }

    private void configureButtons() {
        if (nursedoc != null) {
            nursedoc.setDisable(true);
        }
        if (patient != null) {
            patient.setDisable(true);
        }
        if (staff != null) {
            staff.setDisable(true);
        }
    }


}
