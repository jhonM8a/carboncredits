package com.jochoa.carboncredits.controllers;

import com.jochoa.carboncredits.entities.Evaluation;
import com.jochoa.carboncredits.entities.Evaluator;
import com.jochoa.carboncredits.repositories.IEvaluationRepository;
import com.jochoa.carboncredits.repositories.IEvaluatorRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluations")
public class EvaluationsController {

    @Autowired
    IEvaluationRepository evaluationRepository;

    @PostMapping("/")
    public void saveEvaluation(@RequestBody Evaluation evaluation) {
        evaluationRepository.save(evaluation);
    }

    @GetMapping("/all")
    public List<Evaluation> getall() {
        return evaluationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Evaluation getEvaluationById(@PathVariable Long id) {
        Optional<Evaluation> optionalEvaluation = evaluationRepository.findById(id);
        if (!optionalEvaluation.isEmpty()) {;
            return optionalEvaluation.get();
        } else {
            return null;
        }
    }
}
