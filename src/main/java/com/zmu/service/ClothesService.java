package com.zmu.service;

import com.zmu.dto.ClothesDto;
import com.zmu.model.Clothes;

public interface ClothesService {
    Clothes save(ClothesDto clothesDto);

    void delete(ClothesDto clothesDto);
}
