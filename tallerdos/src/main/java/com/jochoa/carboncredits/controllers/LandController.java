package com.jochoa.carboncredits.controllers;

import com.jochoa.carboncredits.entities.Land;
import com.jochoa.carboncredits.repositories.ILandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lands")
public class LandController {

    @Autowired
    ILandRepository landRepository;

    @PostMapping("/")
    public ResponseEntity saveLand(@RequestBody Land land){
        landRepository.save(land);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Land getLandbyId(@PathVariable Long id){
        Optional<Land> land = landRepository.findById(id);
        if(!land.isEmpty()){
            return land.get();
        }else{
            return null;
        }
    }

    @GetMapping("/all")
    public List<Land> getallLands(){
        return landRepository.findAll();
    }



}
