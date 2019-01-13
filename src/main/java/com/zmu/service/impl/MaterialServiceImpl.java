package com.zmu.service.impl;

import com.zmu.dto.MaterialDto;
import com.zmu.model.CurrentMaterial;
import com.zmu.repository.CurrentMaterialRepository;
import com.zmu.service.MaterialService;
import com.zmu.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private TransformationService transformationService;
    @Autowired
    private CurrentMaterialRepository currentMaterialRepository;

    @Override
    public CurrentMaterial saveMaterial(MaterialDto materialDto) {
        CurrentMaterial newMaterial = transformationService.DtoToEntity(materialDto);
        return currentMaterialRepository.save(newMaterial);
    }
}
