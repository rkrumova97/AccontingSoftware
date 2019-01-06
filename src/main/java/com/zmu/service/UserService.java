package com.zmu.service;

import com.zmu.dto.NewMaterialDto;
import com.zmu.model.NewMaterial;

public interface UserService {
    NewMaterial saveMaterial(NewMaterialDto newMaterialDto);
}
