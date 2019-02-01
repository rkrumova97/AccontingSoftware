package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import com.zmu.model.Project;
import com.zmu.service.ProjectService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProjectsController {
    @Autowired
    private UtilService utilService;
    @Autowired
    private ProjectService projectService;

    public TableView table;
    public Button back;
    public Button addNewProject;
    public ComboBox<String> project;

    @FXML
    public void initialize() {
        ObservableList<String> observableList = FXCollections.observableList(projectService.findAll().stream().map(Project::getName).collect(Collectors.toList()));

        TableColumn<Project, String> id = new TableColumn<>("ID");
        TableColumn<Project, String> name = new TableColumn<>("Име");
        TableColumn<Project, String> company = new TableColumn<>("Kомпания");
        TableColumn<Project, String> city = new TableColumn<>("Град");
        TableColumn<Project, String> outcomes = new TableColumn<>("Разходи");
        TableColumn<Project, String> incomes = new TableColumn<>("Приходи");


        project.setItems(observableList);

        table.getColumns().addAll(id, name, company, city, outcomes, incomes);

        project.setOnAction(e ->{
            id.setCellValueFactory(
                    new PropertyValueFactory<>("id"));
            name.setCellValueFactory(
                    new PropertyValueFactory<>("name"));
            company.setCellValueFactory(
                    new PropertyValueFactory<>("company")
            );
            city.setCellValueFactory(
                    new PropertyValueFactory<>("city")
            );
            outcomes.setCellValueFactory(
                    new PropertyValueFactory<>("outcomes")
            );
            incomes.setCellValueFactory(
                    new PropertyValueFactory<>("incomes")
            );

            List list = projectService.findByName(project.getValue());
            final ObservableList data = FXCollections.observableArrayList(list);
            table.setItems(data);
        });


        utilService.changeScene(back, "/views/accounting.fxml");
        utilService.changeScene(addNewProject, "/views/new_project.fxml");
    }

}
