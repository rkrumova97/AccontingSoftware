package com.zmu.service.impl;

import com.zmu.dto.ProjectDto;
import com.zmu.model.Project;
import com.zmu.repository.ProjectRepository;
import com.zmu.service.ProjectService;
import com.zmu.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TransformationService transformationService;

    @Override
    public Project save(ProjectDto project) {
        return projectRepository.save(transformationService.DtoToEntity(project));
    }

    @Override
    public Project findByName(String name) {
        return projectRepository.findByName(name);
    }


}
