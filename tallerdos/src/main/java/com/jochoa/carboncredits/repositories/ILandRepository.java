package com.jochoa.carboncredits.repositories;

import com.jochoa.carboncredits.entities.Land;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ILandRepository extends CrudRepository<Land, Long> {

    @Override
    List<Land> findAll();

}
