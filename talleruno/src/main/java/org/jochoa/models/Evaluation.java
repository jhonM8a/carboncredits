package org.jochoa.models;

public class Evaluation {
    private Long land_id;
    private Long evaluator_id;
    private String status;
    private String figures;

    public Evaluation(Long land_id, Long evaluator_id, String status, String figures) {
        this.land_id = land_id;
        this.evaluator_id = evaluator_id;
        this.status = status;
        this.figures = figures;
    }

    public Evaluation() {
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
