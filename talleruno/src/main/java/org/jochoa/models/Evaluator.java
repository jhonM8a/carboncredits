package org.jochoa.models;

public class Evaluator {
    private Long evaluator_Id;
    private String name;

    public Evaluator() {
    }

    public Evaluator(Long evaluator_Id, String name) {
        this.evaluator_Id = evaluator_Id;
        this.name = name;
    }

    public Long getEvaluator_Id() {
        return evaluator_Id;
    }

    public void setId(Long evaluator_Id) {
        this.evaluator_Id = evaluator_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
