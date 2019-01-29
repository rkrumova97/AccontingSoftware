package com.zmu.fx_controller;

import com.zmu.dto.CarDto;
import com.zmu.dto.ClothesDto;
import com.zmu.dto.MachineDto;
import com.zmu.dto.MaterialDto;
import com.zmu.model.*;
import com.zmu.service.CarService;
import com.zmu.service.ClothesService;
import com.zmu.service.MachineService;
import com.zmu.service.MaterialService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReportingController {
    //Material tab
    public TextField mDocument;
    public TextField mSupplier;
    public TextField mQuantity;
    public TextField mPrice;
    public ComboBox<String> mMeasurement;
    public Button saveMaterial;
    public TextField mName;
    public DatePicker mDate;

    // Clothes tab
    public ComboBox<Type> type;
    public TextField model;
    public ComboBox<String> clothesMeasurement;
    public TextField clothesQuantity;
    public TextField clothesPrice;
    public TextField clothesDocument;
    public TextField clothesNumber;
    public DatePicker clothesDate;
    public TextField clohesSupplier;
    public Button saveClothes;

    //Machine tab
    public TextField machineDocument;
    public TextField machinePrice;
    public TextField machineQuantity;
    public ComboBox<String> machineMeasurement;
    public TextField machineName;
    public DatePicker machineDate;
    public TextField machineSupplier;
    public Button saveMachine;

    //Car tab
    public TextField carPrice;
    public TextField carQuantity;
    public TextField carDocument;
    public ComboBox<String> carMeasurement;
    public Button saveCar;
    public TextField insurance;
    public TextField priceInsurance;
    public TextField inspecion;
    public TextField carModel;
    public TextField carNumber;
    public TextField inspectionPrice;
    public TextField tollTicket;
    public TextField tollPrice;
    public DatePicker dateInsurance;
    public DatePicker tollDate;
    public DatePicker inspectionDate;
    public DatePicker carDate;
    public TextField carSupplier;
    public Button uploadTalon;
    public Button uploadDocument;
    public TextField carModel1;


    @Autowired
    private MaterialService materialService;

    @Autowired
    private ClothesService clothesService;

    @Autowired
    private MachineService machineService;
    @Autowired
    private CarService carService;

    @FXML
    public void initialize() {
        //fill combobox
        fillCombobox(mMeasurement);
        fillCombobox(machineMeasurement);
        fillCombobox(clothesMeasurement);
        fillCombobox(carMeasurement);
        type.setItems(FXCollections.observableArrayList(Type.values()));

        saveMaterial.setOnAction(e -> {
            MaterialDto materialDto = buildMDto();
            Material material = materialService.saveMaterial(materialDto);
            message(material);
        });

        saveClothes.setOnAction(e -> {
            ClothesDto clothesDto = buildCDto();
            Clothes clothes = clothesService.save(clothesDto);
            message(clothes);
        });

        saveMachine.setOnAction(e->{
            MachineDto machineDto = buildMachineDto();
            Machine machine = machineService.save(machineDto);
            message(machine);
        });

        saveMachine.setOnAction(e->{
            CarDto carDto = buildCarDto();
            Car car = carService.save(carDto);
            message(car);
        });
    }

    private CarDto buildCarDto() {
        return CarDto.builder()
                .name(carModel.getText())
                .numberOfInvoice(carDocument.getText())
                .quantity(carQuantity.getText())
                .measurement(carMeasurement.getValue())
                .price(carPrice.getText())
                .localDate(carDate.getValue())
                .supplier(carSupplier.getText())
                .endDateInspection(inspectionDate.getValue())
                .endDateInsurance(dateInsurance.getValue())
                .inspection(inspecion.getText())
                .insurance(insurance.getText())
                .inspectionPrice(inspectionPrice.getText())
                .insurancePrice(priceInsurance.getText())
                .razhNorma(carModel1.getText())
//   todo             .invoiceFile(dto.getInvoiceFile())
//                .talon(dto.getTalon())
                .toll(tollTicket.getText())
                .tollPrice(tollPrice.getText())
                .endDateToll(tollDate.getValue())
                .build();
    }

    private <T extends Good> void message(T material) {
        if (material != null) {
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

    private MaterialDto buildMDto() {
        return MaterialDto.builder()
                .name(mName.getText())
                .numberOfInvoice(mDocument.getText())
                .quantity(mQuantity.getText())
                .measurement(mMeasurement.getValue())
                .price(mPrice.getText())
                .date(mDate.getValue())
                .supplier(mSupplier.getText())
                .build();
    }

    private ClothesDto buildCDto() {
        return ClothesDto.builder()
                .name(model.getText())
                .numberOfInvoice(clothesDocument.getText())
                .quantity(clothesQuantity.getText())
                .measurement(clothesMeasurement.getValue())
                .price(clothesPrice.getText())
                .localDate(clothesDate.getValue())
                .supplier(clohesSupplier.getText())
                .number(clothesNumber.getText())
                .build();
    }

    private MachineDto buildMachineDto(){
        return MachineDto.builder()
                .name(machineName.getText())
                .numberOfInvoice(machineDocument.getText())
                .quantity(machineQuantity.getText())
                .measurement(machineMeasurement.getValue())
                .price(machinePrice.getText())
                .localDate(machineDate.getValue())
                .supplier(machineSupplier.getText())
                .build();
    }

    private void fillCombobox(ComboBox<String> comboBox) {
        comboBox.getItems().addAll(
                "КГ",
                "Брой"
        );
    }
}
