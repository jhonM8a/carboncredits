package com.jochoa.carboncredits.controllers;

import com.jochoa.carboncredits.entities.Evaluation;
import com.jochoa.carboncredits.entities.Evaluator;
import com.jochoa.carboncredits.repositories.IEvaluatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evaluators")
public class EvaluatorController {
    @Autowired
    IEvaluatorRepository evaluatorRepository;

    @PostMapping("/")
    public ResponseEntity saveEvaluator(@RequestBody Evaluator evaluator){
        evaluatorRepository.save(evaluator);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public List<Evaluator>  getall(){
        return evaluatorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Evaluator getEvaluationById(@PathVariable Long id) {
        Optional<Evaluator> optionalEvaluator = evaluatorRepository.findById(id);
        if (!optionalEvaluator.isEmpty()) {;
            return optionalEvaluator.get();
        } else {
            return null;
        }
    }
}
