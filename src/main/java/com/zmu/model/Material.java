package com.zmu.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "material")
public class Material extends Good{
    @OneToOne
    @JoinColumn(name = "project")
    private Project project;

    @Builder
    private Material(Long id, String name, String measurement, Double quantity, Double price, Double totalPrice, Integer numberOfInvoice, LocalDate localDate, String supplier, Project project){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice, localDate, supplier);
        this.project = project;
    }
}