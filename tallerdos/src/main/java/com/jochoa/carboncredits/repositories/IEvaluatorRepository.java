package com.jochoa.carboncredits.repositories;

import com.jochoa.carboncredits.entities.Evaluator;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEvaluatorRepository extends CrudRepository<Evaluator, Long> {
    @Override
    List<Evaluator> findAll();
}
