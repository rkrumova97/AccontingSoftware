package com.zmu.repository;

import com.zmu.model.Material;

import java.util.List;

public interface MaterialRepository extends GoodRepository<Material, Long> {
    List<Material> findByName(String name);
}
