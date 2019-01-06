package com.zmu.fx_controller;

import com.zmu.dto.NewMaterialDto;
import com.zmu.service.UserService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReportingController {
    public TextField materialName;
    public TextField numberOfDocument;
    public TextField quantity;
    public TextField price;
    public TextField totalPrice;
    public ComboBox<String> measurement;
    public Button saveMaterial;

    @Autowired
    private UserService userService;

    @FXML
    public void initialize() {
        measurement.getItems().addAll(
                "КГ",
                "Брой"
        );


        saveMaterial.setOnAction(e -> {
            NewMaterialDto newMaterialDto = buildDto();
            userService.saveMaterial(newMaterialDto);
            System.out.println("DONE");
        });
    }

    private NewMaterialDto buildDto() {
        return NewMaterialDto.builder()
                .measurement(measurement.getValue())
                .name(materialName.getText())
                .numberOfInvoice(numberOfDocument.getText())
                .quantity(quantity.getText())
                .price(price.getText())
                .totalPrice(totalPrice.getText())
                .build();
    }
}
