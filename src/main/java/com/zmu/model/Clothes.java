package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "clothes")
@AllArgsConstructor
@NoArgsConstructor
public class Clothes extends Good{
    @Column
    private Type type;

    @Column
    private Integer number;

    @Column
    private Boolean given;

    @Column
    private Boolean used;

    @Builder
    private Clothes(Long id, String name, String measurement, Double quantity, Double price, Double totalPrice, Integer numberOfInvoice, LocalDate localDate, String supplier, Type type, Integer number, Boolean used, Boolean given){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice, localDate, supplier);
        this.type = type;
        this.given=given;
        this.number=number;
        this.used=used;

    }
}
