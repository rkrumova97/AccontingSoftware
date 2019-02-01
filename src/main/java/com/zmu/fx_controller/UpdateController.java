package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import com.zmu.model.*;
import com.zmu.service.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UpdateController {
    public Button back;

    // Car tab
    public TextField kilometers;
    public TextField numberOfCar;
    public TextField invoiceCar;
    public Button saveCar;
    public TableView table;
    public CheckBox checkMotocar;

    //Material tab
    public TextField invoiceOutgoing;
    public ListView<Material> list;
    public ComboBox<String> project;

    //Repair tab
    public ComboBox<String> type;
    public DatePicker date;
    public TextField name;
    public TextField invoiceRepair;
    public TextField price;

    //Brak
    public TextField model;
    public TextField invoiceBrak;
    public Button brak;

    //LPS
    public TextField modelClothes;
    public TextField invoiceLPS;
    public CheckBox given;
    public CheckBox used;
    public Button saveMaterial;
    public Button repair;
    public Button saveClo;

    @Autowired
    private ProjectService projectService;
    @Autowired
    private UtilService utilService;

    @Autowired
    private CarService carService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private MachineService machineService;
    @Autowired
    private ClothesService clothesService;

    @FXML
    public void initialize() {
        List<Material> all = materialService.findAll();
        ObservableList<Material> materials = FXCollections.observableArrayList(all);
        list.setItems(materials);

        type.setItems(FXCollections.observableArrayList("Koли", "ЛПС", "Материали", "Машини"));

        project.setItems(FXCollections.observableArrayList(projectService.findAll().stream().map(Project::getName).collect(Collectors.toList())));

        TableColumn<Project, String> litres = new TableColumn<>("Литри");
        TableColumn<Project, String> totalPrice = new TableColumn<>("Обща цена");

        table.getColumns().addAll(litres, totalPrice);

        saveCar.setOnAction(e -> {
            Car cars = carService.findAllByNumberAndInvoice(Integer.parseInt(numberOfCar.getText()), Integer.parseInt(invoiceCar.getText()));
            cars.setKilometers(Double.parseDouble(kilometers.getText()));
            cars.setFuel(checkMotocar.isSelected());
            carService.save(cars);
            utilService.message(cars);
            litres.setCellValueFactory(
                    new PropertyValueFactory<>("fuel"));
            totalPrice.setCellValueFactory(
                    new PropertyValueFactory<>("fuelTotalPrice"));
            final ObservableList data = FXCollections.observableArrayList(cars);
            table.setItems(data);
        });

        saveMaterial.setOnAction(e -> {
            Material material = list.getSelectionModel().getSelectedItem();
            material.setProject(projectService.findOneByName(project.getValue()));
            materialService.save(material);
            utilService.message(material);
        });

        brak.setOnAction(e -> {
            Machine one = machineService.findOne(model.getText(), Integer.parseInt(invoiceBrak.getText()));
            one.setIsScrapped(true);
            machineService.save(one);
            utilService.message(one);

        });

        saveClo.setOnAction(e ->{
            Clothes one = clothesService.findOne(modelClothes.getText(), Integer.parseInt(invoiceLPS.getText()));
            one.setGiven(given.isSelected());
            one.setUsed(used.isSelected());
            utilService.message(one);
        });


        utilService.changeScene(back, "/views/accounting.fxml");
    }
}
