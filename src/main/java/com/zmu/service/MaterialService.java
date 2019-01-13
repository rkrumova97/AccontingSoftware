package com.zmu.service;

import com.zmu.dto.MaterialDto;
import com.zmu.model.CurrentMaterial;

public interface MaterialService {
    CurrentMaterial saveMaterial(MaterialDto newMaterialDto);

}
