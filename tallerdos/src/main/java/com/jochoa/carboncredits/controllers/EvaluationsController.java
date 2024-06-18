package com.jochoa.carboncredits.controllers;

import com.jochoa.carboncredits.entities.Evaluation;
import com.jochoa.carboncredits.repositories.IEvaluationRepository;
import com.jochoa.carboncredits.repositories.IEvaluatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void saveEvaluation(@RequestBody Evaluation evaluation){
        evaluationRepository.save(evaluation);
    }
}
