package com.zmu.repository;

import com.zmu.model.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface GoodRepository<T extends Good, E extends Serializable> extends
        JpaRepository<T, E> {

}
