package com.uam.gestorcitas.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppNavigator {

    public static void loadScene(String fxml, Stage stage) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    AppNavigator.class.getResource("/views/" + fxml)
            );

            Parent root = loader.load();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setMaximized(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}