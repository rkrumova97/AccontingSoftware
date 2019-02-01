package com.zmu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ZmuApplication extends Application {

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
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/views/start.fxml"));
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
