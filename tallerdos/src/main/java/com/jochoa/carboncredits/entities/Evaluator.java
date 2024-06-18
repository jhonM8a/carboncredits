package com.jochoa.carboncredits.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="evaluators")
public class Evaluator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluator_Id;

    private String name;

    /*@OneToMany(mappedBy = "evaluator", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evaluation> evaluations;*/

    public Evaluator() {
    }

    public Long getEvaluator_Id() {
        return evaluator_Id;
    }

    public void setEvaluator_Id(Long evaluator_Id) {
        this.evaluator_Id = evaluator_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }*/
}
