package com.zmu.model;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "current_material")
public class CurrentMaterial extends Good{
    @OneToOne
    @JoinColumn(name = "project")
    private Project project;

    @Builder
    private CurrentMaterial(Long id, String name, String measurement, Double quantity, Double price, Double totalPrice, Integer numberOfInvoice, Project project){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice);
        this.project = project;
    }
}
