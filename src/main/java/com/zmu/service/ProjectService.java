package com.zmu.service;

import com.zmu.dto.ProjectDto;
import com.zmu.model.Project;

import java.util.List;

public interface ProjectService {
    Project save(ProjectDto project);

    List<Project> findByName(String name);

    Project findOneByName(String name);


    List<Project> findAll();
}
