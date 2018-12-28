package com.zmu;

import com.zmu.fx_controller.AccountingController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ZmuApplication extends Application {
    @Autowired
    private AccountingController accountingController;

    private ConfigurableApplicationContext context;
    private Parent rootNode;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ZmuApplication.class);
        context = builder.run(getParameters().getRaw().toArray(new String[0]));

        Platform.setImplicitExit(false);
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/templates/start.fxml"));
        loader.setControllerFactory(context::getBean);
        rootNode = loader.load();

    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setScene(new Scene(rootNode, 600, 400));
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception {
        context.stop();
    }

}
