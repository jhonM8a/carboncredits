package com.jochoa.carboncredits.repositories;

import com.jochoa.carboncredits.entities.Evaluation;
import org.springframework.data.repository.CrudRepository;

public interface IEvaluationRepository extends CrudRepository<Evaluation, Long> {
}
