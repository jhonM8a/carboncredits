package com.jochoa.carboncredits.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="evaluations")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluation_id;

    private Long land_id;

    private Long evaluator_id;


    @Column(nullable = false)
    private String status;

    private String figures;

    public Evaluation() {
    }

    public Long getEvaluation_id() {
        return evaluation_id;
    }

    public void setEvaluation_id(Long evaluation_id) {
        this.evaluation_id = evaluation_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFigures() {
        return figures;
    }

    public void setFigures(String figures) {
        this.figures = figures;
    }

    public Long getLand_id() {
        return land_id;
    }

    public void setLand_id(Long land_id) {
        this.land_id = land_id;
    }

    public Long getEvaluator_id() {
        return evaluator_id;
    }

    public void setEvaluator_id(Long evaluator_id) {
        this.evaluator_id = evaluator_id;
    }
}
