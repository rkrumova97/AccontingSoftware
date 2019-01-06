package com.zmu.service;

import com.zmu.dto.GoodDto;
import com.zmu.dto.NewMaterialDto;
import com.zmu.model.Good;
import com.zmu.model.NewMaterial;

public interface TransformationService<T extends Good,TDto extends GoodDto> {
    NewMaterial DtoToEntity(NewMaterialDto dto);
}
