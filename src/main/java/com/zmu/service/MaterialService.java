package com.zmu.service;

import com.zmu.dto.MaterialDto;
import com.zmu.model.Material;

import java.util.List;

public interface MaterialService {
    Material saveMaterial(MaterialDto newMaterialDto);

    Material save(Material materialDto);

    Material findOne(String s, Integer i);

    List<Material> findAll();
}
