package com.zmu.repository;

import com.zmu.model.Clothes;

public interface ClothesRepository extends GoodRepository<Clothes, Long> {
    Clothes findByNameAndNumberOfInvoice(String name, Integer numberOfInvoice);

}
