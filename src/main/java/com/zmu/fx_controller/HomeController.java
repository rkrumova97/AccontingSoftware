package com.zmu.fx_controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Objects;

@Controller
public class HomeController {
    @FXML
    private Button accounting;

    @FXML
    public void initialize() {
        accounting.setOnAction(e -> {
            Node node = (Node) e.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/templates/accounting.fxml"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Scene scene = new Scene(Objects.requireNonNull(root));
            stage.setScene(scene);
            stage.show();
        });
    }
}
