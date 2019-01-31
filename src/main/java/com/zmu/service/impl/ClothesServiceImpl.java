package com.zmu.service.impl;

import com.zmu.dto.CarDto;
import com.zmu.dto.ClothesDto;
import com.zmu.model.Car;
import com.zmu.model.Clothes;
import com.zmu.repository.CarRepository;
import com.zmu.repository.ClothesRepository;
import com.zmu.service.ClothesService;
import com.zmu.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesServiceImpl implements ClothesService {
    @Autowired
    private ClothesRepository clothesRepository;

    @Autowired
    private TransformationService transformationService;

    @Override
    public Clothes save(ClothesDto clothesDto){
        return clothesRepository.save(transformationService.DtoToEntity(clothesDto));
    }

    @Override
    public void delete(ClothesDto clothesDto){
        clothesRepository.delete(transformationService.DtoToEntity(clothesDto));
    }

    @Override
    public List<Clothes> findAll(){
        return clothesRepository.findAll();
    }

}
