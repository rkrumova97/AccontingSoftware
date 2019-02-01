package com.zmu.service.impl;

import com.zmu.dto.MaterialDto;
import com.zmu.model.Clothes;
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
    @Override
    public Material save(Material materialDto) {
        return materialRepository.save(materialDto);
    }

@Override
public Material findOne(String s, Integer i){
        return materialRepository.findByNameAndNumberOfInvoice(s, i);
}

    @Override
    public List<Material> findAll(){
        return materialRepository.findAll();
    }
}
