package com.zmu.service.impl;

import com.zmu.dto.CarDto;
import com.zmu.model.Car;
import com.zmu.repository.CarRepository;
import com.zmu.service.CarService;
import com.zmu.service.TransformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private TransformationService transformationService;

    @Override
    public Car save(CarDto carDto){
        return carRepository.save(transformationService.DtoToEntity(carDto));
    }

    @Override
    public void delete(CarDto carDto){
         carRepository.delete(transformationService.DtoToEntity(carDto));
    }

    @Override
    public List<Car> findAll(){
        return carRepository.findAll();
    }
}
