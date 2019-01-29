package com.zmu.service;

import com.zmu.dto.CarDto;
import com.zmu.model.Car;

import java.util.List;

public interface CarService {
    Car save(CarDto carDto);

    void delete(CarDto carDto);

    List<Car> findAll();
}
