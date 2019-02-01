package com.zmu.fx_controller;

import com.zmu.fx_controller.util.UtilService;
import com.zmu.model.Project;
import com.zmu.service.ProjectService;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphicsController {
    public BubbleChart<String, Double> bubbleChart;
    public Button back;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private UtilService utilService;

    @FXML
    public void initialize() {
        List<Project> projects = projectService.findAll();
        XYChart.Series seriesI = new XYChart.Series<>();
        for(Project p : projects){
            seriesI.getData().add(new XYChart.Data(p.getOutcomes(), p.getIncomes()));
        }

        bubbleChart.getData().addAll(seriesI);
        utilService.changeScene(back, "/views/viewer.fxml");
    }
}
