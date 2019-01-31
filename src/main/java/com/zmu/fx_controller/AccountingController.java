package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Objects;

@Controller
@Data
public class AccountingController {
    @Autowired
    private UtilService utilService;

    @FXML
    private Button home;

    @FXML
    private Button reporting;

    @FXML
    private Button viewer;

    @FXML
    private Button projects;

    @FXML
    private Button statistics;

    @FXML
    public void initialize() {
        utilService.changeScene(reporting,"/templates/reporting_page.fxml");

        utilService.changeScene(viewer, "/templates/viewer.fxml");

        utilService.changeScene(projects,"/templates/projects.fxml");

        utilService.changeScene(statistics,"/templates/month_report.fxml");

        utilService.changeScene(home,"/templates/start.fxml");
    }
}
