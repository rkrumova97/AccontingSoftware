package com.zmu.service;

import com.zmu.dto.ProjectDto;
import com.zmu.model.Project;

public interface ProjectService {
    Project save(ProjectDto project);

    Project findByName(String name);
}
