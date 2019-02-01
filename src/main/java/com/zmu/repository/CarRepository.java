package com.zmu.repository;

import com.zmu.model.Car;

import java.util.List;

public interface CarRepository extends GoodRepository<Car,Long> {
    Car findByNumberAndNumberOfInvoice(Integer number, Integer numberOfInvoice);
}
