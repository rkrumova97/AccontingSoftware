package com.zmu.fx_controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Objects;

@Controller
@Data
public class AccountingController {
    @Autowired
    private ApplicationContext context;

    @FXML
    private Button home;

    @FXML
    private Button reporting;

    @FXML
    private Button searching;

    @FXML
    private Button projects;

    @FXML
    private Button statistics;

    @FXML
    public void initialize() {
        reporting.setOnAction(e -> {
            Node node = (Node) e.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/templates/reporting_page.fxml"));
                loader.setControllerFactory(context::getBean);
                root = loader.load();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Scene scene = new Scene(Objects.requireNonNull(root));
            stage.setScene(scene);
            stage.setX(0);
            stage.setY(0);
            stage.show();
        });

        searching.setOnAction(e -> {
            Node node = (Node) e.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/templates/viewer.fxml"));
                loader.setControllerFactory(context::getBean);
                root = loader.load();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Scene scene = new Scene(Objects.requireNonNull(root));
            stage.setScene(scene);
            stage.show();
        });

        projects.setOnAction(e -> {
            Node node = (Node) e.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/templates/projects.fxml"));
                loader.setControllerFactory(context::getBean);
                root = loader.load();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Scene scene = new Scene(Objects.requireNonNull(root));
            stage.setScene(scene);
            stage.show();
        });

        statistics.setOnAction(e -> {
            Node node = (Node) e.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/templates/month_report.fxml"));
                loader.setControllerFactory(context::getBean);
                root = loader.load();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Scene scene = new Scene(Objects.requireNonNull(root));
            stage.setScene(scene);
            stage.show();
        });

        home.setOnAction(e -> {
            Node node = (Node) e.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/templates/start.fxml"));
                loader.setControllerFactory(context::getBean);
                root = loader.load();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Scene scene = new Scene(Objects.requireNonNull(root));
            stage.setScene(scene);
            stage.show();
        });
    }
}
