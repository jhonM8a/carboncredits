package com.jochoa.carboncredits.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="lands")
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long land_id;

    @ManyToOne
    @JoinColumn(name = "landowner_id", referencedColumnName = "landowner_id")
    @JsonBackReference

    LandOwner landowner_id;
    String description;


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

}
