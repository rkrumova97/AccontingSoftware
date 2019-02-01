package com.zmu.fx_controller.util;

import com.zmu.model.Good;
import com.zmu.service.CarService;
import com.zmu.service.ClothesService;
import com.zmu.service.MachineService;
import com.zmu.service.MaterialService;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Service
public class UtilServiceImpl implements UtilService {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private CarService carService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private MachineService machineService;
    @Autowired
    private ClothesService clothesService;

    @Override
    public void changeScene(Button button, String fxml) {
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        button.setOnAction(e -> {
            Node node = (Node) e.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxml));
                loader.setControllerFactory(context::getBean);
                root = loader.load();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Scene scene = new Scene(Objects.requireNonNull(root));
            stage.setScene(scene);
            stage.setX(0);
            stage.setY(0);
            stage.setHeight(primaryScreenBounds.getHeight());
            stage.show();
        });
    }

    @Override
    public <T> void message(T good) {
        if (good != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Successful Dialog");
            alert.setHeaderText("SAVED");
            alert.setContentText("ВАШИТЕ ДАННИ СЕ ЗАПИСАХА УСПЕШНО!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error dialog");
            alert.setHeaderText("FAILED");
            alert.setContentText("ВАШИТЕ ДАННИ НЕ СА ЗАПИСАНИ!");
            alert.showAndWait();
        }
    }



}
