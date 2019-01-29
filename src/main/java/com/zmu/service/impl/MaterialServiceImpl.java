package com.zmu.service.impl;

import com.zmu.dto.MaterialDto;
import com.zmu.model.Material;
import com.zmu.repository.MaterialRepository;
import com.zmu.service.MaterialService;
import com.zmu.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private TransformationService transformationService;
    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public Material saveMaterial(MaterialDto materialDto) {
        return materialRepository.save(transformationService.DtoToEntity(materialDto));
    }

    //TODO: Set project
    @Override
    public void updateCurrent(MaterialDto materialDto){
//        List<Material> materials = materialRepository.findByName(materialDto.getName());
//        for(Material material : materials){
//            material.setNumberOfInvoice(materialDto.getNumberOfInvoice());
//            material.setQuantity(Double.parseDouble(materialDto.getQuantity()));
//            materialRepository.save(material);
//        }
    }
}
