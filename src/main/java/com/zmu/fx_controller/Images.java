package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import com.zmu.model.Car;
import com.zmu.service.CarService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Images {

    public ImageView invoice;
    public ImageView talon;
    public Button back;

    @Autowired
    private CarService carService;

    @Autowired
    private UtilService utilService;

    @FXML
    public void initialize() {
        List<Car> all = carService.findAll();
        Car car = all.get(all.size() - 1);

        utilService.changeScene(back, "/view/reporting_page.fxml");
    }
}
