package com.jochoa.carboncredits.repositories;

import com.jochoa.carboncredits.entities.Evaluation;
import com.jochoa.carboncredits.entities.Evaluator;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IEvaluationRepository extends CrudRepository<Evaluation, Long> {
    @Override
    List<Evaluation> findAll();
}
