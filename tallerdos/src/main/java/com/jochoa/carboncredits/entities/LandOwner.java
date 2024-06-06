package com.jochoa.carboncredits.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="landowners")
public class LandOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long landowner_id;
    String name;
    String identification;
    String phone;

    @OneToMany(mappedBy = "landowner_id")
    @JsonManagedReference

    Set<Land> lands;

    public LandOwner(Long landOwner, String name, String indentification, String phone) {
        this.landowner_id = landOwner;
        this.name = name;
        this.identification = indentification;
        this.phone = phone;
    }

    public LandOwner() {
    }

    public Long getLandowner_id() {
        return landowner_id;
    }

    public void setLandowner_id(Long landowner_id) {
        this.landowner_id = landowner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Land> getLands() {
        return lands;
    }

    public void setLands(Set<Land> lands) {
        this.lands = lands;
    }
}
