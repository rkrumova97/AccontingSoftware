package com.zmu.service;

import com.zmu.dto.NewMaterialDto;
import com.zmu.model.NewMaterial;

public interface NewMaterialService {
    NewMaterial saveMaterial(NewMaterialDto newMaterialDto);
}
