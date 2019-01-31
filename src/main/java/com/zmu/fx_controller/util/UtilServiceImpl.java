package com.zmu.fx_controller.util;

import com.zmu.dto.ProjectDto;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;

@Service
public class UtilServiceImpl implements UtilService{
    @Autowired
    private ApplicationContext context;

    @Override
    public void changeScene(Button button, String fxml) {
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
            stage.show();
        });
    }


}
