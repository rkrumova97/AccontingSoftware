package com.zmu.service;

import com.zmu.dto.ClothesDto;
import com.zmu.model.Clothes;

import java.util.List;

public interface ClothesService {
    Clothes save(ClothesDto clothesDto);

    void delete(ClothesDto clothesDto);

    List<Clothes> findAll();
}
