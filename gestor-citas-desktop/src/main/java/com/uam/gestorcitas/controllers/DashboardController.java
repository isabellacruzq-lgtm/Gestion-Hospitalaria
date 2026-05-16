package com.uam.gestorcitas.controllers;

import com.uam.gestorcitas.utils.AppNavigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    public void openAppointmentView(ActionEvent event) {

        Stage stage = (Stage) ((javafx.scene.Node)
                event.getSource()).getScene().getWindow();

        AppNavigator.loadScene("appointment-view.fxml", stage);
    }
}