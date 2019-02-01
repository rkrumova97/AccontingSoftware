package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
        utilService.changeScene(reporting, "/views/reporting_page.fxml");

        utilService.changeScene(viewer, "/views/viewer.fxml");

        utilService.changeScene(projects, "/views/projects.fxml");

        utilService.changeScene(statistics, "/views/month_report.fxml");

        utilService.changeScene(home, "/views/start.fxml");
    }
}
