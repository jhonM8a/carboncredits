package com.jochoa.carboncredits.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="lands")
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long land_id;

    @ManyToOne
    @JoinColumn(name = "landowner_id")
    LandOwner landowner_id;
    String description;

    @OneToMany(mappedBy = "land", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evaluation> evaluations;
    public Land() {
    }

    public Long getLand_id() {
        return land_id;
    }

    public void setLand_id(Long land_id) {
        this.land_id = land_id;
    }

    public LandOwner getLandowner_id() {
        return landowner_id;
    }

    public void setLandowner_id(LandOwner landowner_id) {
        this.landowner_id = landowner_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }
}
