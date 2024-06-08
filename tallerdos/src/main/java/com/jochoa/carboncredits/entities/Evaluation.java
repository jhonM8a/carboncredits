package com.jochoa.carboncredits.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="evaluations")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluation_id;

    @ManyToOne
    @JoinColumn(name = "land_id")
    private Land land;

    @ManyToOne
    @JoinColumn(name = "evaluator_id")
    private Evaluator evaluator;

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

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public Evaluator getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Evaluator evaluator) {
        this.evaluator = evaluator;
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
}
