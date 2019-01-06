package com.zmu.repository;

import com.zmu.model.NewMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewMaterialRepository extends GoodRepository<NewMaterial,Long> {
}
