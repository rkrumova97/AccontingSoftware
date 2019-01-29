package com.zmu.service;

import com.zmu.dto.MaterialDto;
import com.zmu.model.Material;

public interface MaterialService {
    Material saveMaterial(MaterialDto newMaterialDto);

    //TODO: Set project
    void updateCurrent(MaterialDto materialDto);
}
