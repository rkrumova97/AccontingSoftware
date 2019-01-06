package com.zmu.model;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "new_material")
public class NewMaterial extends Good{
    @Builder
    private NewMaterial(Long id, String name, String measurement, Double quantity, Double price, Double totalPrice, Integer numberOfInvoice){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice);
    }
}
