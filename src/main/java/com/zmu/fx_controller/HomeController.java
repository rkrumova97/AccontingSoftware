package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Objects;

@Controller
public class HomeController {
    @Autowired
    private UtilService utilService;
    
    @FXML
    private Button accounting;

    @FXML
    public void initialize() {
        utilService.changeScene(accounting,"/templates/accounting.fxml");
    }
}
