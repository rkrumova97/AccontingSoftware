package com.zmu.fx_controller;

import com.zmu.dto.MaterialDto;
import com.zmu.dto.NewMaterialDto;
import com.zmu.service.MaterialService;
import com.zmu.service.NewMaterialService;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReportingController {
    //MATERIAL PANE
    //New material tab
    public TextField materialName;
    public TextField numberOfDocument;
    public TextField quantity;
    public TextField price;
    public TextField totalPrice;
    public ComboBox<String> measurement;
    public Button saveMaterial;

    //Current material tab
    public TextField cMaterialName;
    public TextField cNumberOfDocument;
    public TextField cquantity;
    public TextField project;
    public Button saveCMaterial;


    @Autowired
    private NewMaterialService newMaterialService;

    @Autowired
    private MaterialService materialService;

    @FXML
    public void initialize() {
        //new material
        measurement.getItems().addAll(
                "КГ",
                "Брой"
        );

        saveMaterial.setOnAction(e -> {
            NewMaterialDto newMaterialDto = buildNMDto();
            newMaterialService.saveMaterial(newMaterialDto);
            message();
        });

        //current material
        saveCMaterial.setOnAction(e -> {
            MaterialDto materialDto = buildMDto();
            materialService.saveMaterial(materialDto);
            message();
        });
    }

    private void message() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successful Dialog");
        alert.setHeaderText("SAVED");
        alert.setContentText("YOUR DATA WAS SAVED!");
        alert.showAndWait();
    }

    private NewMaterialDto buildNMDto() {
        return NewMaterialDto.builder()
                .measurement(measurement.getValue())
                .name(materialName.getText())
                .numberOfInvoice(numberOfDocument.getText())
                .quantity(quantity.getText())
                .price(price.getText())
                .totalPrice(totalPrice.getText())
                .build();
    }

    private MaterialDto buildMDto() {
        return MaterialDto.builder()
                .measurement(measurement.getValue())
                .name(materialName.getText())
                .numberOfInvoice(numberOfDocument.getText())
                .quantity(quantity.getText())
                .price(price.getText())
                .totalPrice(totalPrice.getText())
                .build();
    }
}
