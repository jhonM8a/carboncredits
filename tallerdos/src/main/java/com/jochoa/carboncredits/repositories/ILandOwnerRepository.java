package com.jochoa.carboncredits.repositories;

import com.jochoa.carboncredits.entities.LandOwner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ILandOwnerRepository extends CrudRepository<LandOwner, Long> {
    @Override
    List<LandOwner> findAll();

    //LandOwner findById(long id);

    //LandOwner save(LandOwner landOwner);

}
