package com.zmu.fx_controller;

import com.zmu.dto.ProjectDto;
import com.zmu.fx_controller.util.UtilService;
import com.zmu.service.ProjectService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NewProjectController {
    @Autowired
    private ProjectService projectService;

    @Autowired
    private UtilService utilService;

    public Button save;
    public Button reporting;
    public Button projects;
    public Button accounting;
    public TextField name;
    public TextField company;
    public TextField city;

    @FXML
    public void initialize() {
        save.setOnAction(e -> projectService.save(getDto()));

        utilService.changeScene(reporting,"/templates/reporting_page.fxml");
        utilService.changeScene(projects, "/templates/projects.fxml");
        utilService.changeScene(accounting, "/templates/accounting.fxml");
    }

    public ProjectDto getDto(){
        return ProjectDto.builder()
                .name(name.getText())
                .city(city.getText())
                .company(company.getText())
                .build();
    }
}
