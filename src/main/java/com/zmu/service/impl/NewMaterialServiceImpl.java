package com.zmu.service.impl;

import com.zmu.dto.NewMaterialDto;
import com.zmu.model.NewMaterial;
import com.zmu.repository.NewMaterialRepository;
import com.zmu.service.TransformationService;
import com.zmu.service.NewMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewMaterialServiceImpl implements NewMaterialService {
    @Autowired
    private TransformationService transformationService;
    @Autowired
    private NewMaterialRepository newMaterialRepository;

    @Override
    public NewMaterial saveMaterial(NewMaterialDto newMaterialDto) {
        NewMaterial newMaterial = transformationService.DtoToEntity(newMaterialDto);
        return newMaterialRepository.save(newMaterial);
    }
}
