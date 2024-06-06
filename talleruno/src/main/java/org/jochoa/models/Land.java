package org.jochoa.models;

public class Land {
    Long land_id;
    String description;

    public Land() {
    }

    public Land(Long land_id, String description) {
        this.land_id = land_id;
        this.description = description;
    }

    public Long getLand_id() {
        return land_id;
    }

    public void setLand_id(Long land_id) {
        this.land_id = land_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
