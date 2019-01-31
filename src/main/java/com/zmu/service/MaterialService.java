package com.zmu.service;

import com.zmu.dto.MaterialDto;
import com.zmu.model.Material;

import java.util.List;

public interface MaterialService {
    Material saveMaterial(MaterialDto newMaterialDto);

    //TODO: Set project
    void updateCurrent(MaterialDto materialDto);

    List<Material> findAll();
}
