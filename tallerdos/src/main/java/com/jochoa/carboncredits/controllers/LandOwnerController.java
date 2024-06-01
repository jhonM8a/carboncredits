package com.jochoa.carboncredits.controllers;

import com.jochoa.carboncredits.entities.LandOwner;
import com.jochoa.carboncredits.repositories.ILandOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/landowners")
public class LandOwnerController {

    @Autowired
    ILandOwnerRepository landOwnerRepository;
    @GetMapping("/")
    public List<LandOwner> getAllLandOwner(){
        return landOwnerRepository.findAll();

    }

    @PostMapping("/")
    public void saveLandOwner(@RequestBody LandOwner landOwner){
        landOwnerRepository.save(landOwner);
    }

}
