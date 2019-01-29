package com.zmu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Table(name = "good")
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class Good implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    //TODO:Make the measurement enum
    @Column(name = "measurement")
    private String measurement;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "price")
    private Double price;

    @Column(name = "total_value")
    private Double totalPrice;

    @Column(name = "number_of_invoice")
    private Integer numberOfInvoice;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "supplier")
    private String supplier;
}
