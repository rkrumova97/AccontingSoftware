package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @Autowired
    private UtilService utilService;
    
    @FXML
    private Button accounting;

    @FXML
    public void initialize() {
        utilService.changeScene(accounting, "/views/accounting.fxml");
    }
}
