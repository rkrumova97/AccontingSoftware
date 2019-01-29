package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.File;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "car")
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Good {
    @Column
    private Integer razhNorma;

    @Column
    private Integer number;

    @Column
    private String repair;

    @Column
    private String inspection;

    @Column
    private String insurance;

    @Column
    private String toll;

    @Column
    private Double inspectionPrice;

    @Column
    private Double insurancePrice;

    @Column
    private Double tollPrice;

    @Column
    private LocalDate endDateInspection;

    @Column
    private LocalDate endDateInsurance;

    @Column
    private LocalDate endDateToll;

    @Column
    private File talon;

    @Column
    private File invoiceFile;

    @Builder
    private Car(Long id, String name, String measurement, Double quantity, Double price, Double totalPrice, Integer numberOfInvoice, LocalDate localDate, String supplier,
                Integer razhNorma,
                Integer number, String repair,
                String inspection, String insurance,
                String toll, Double inspectionPrice,
                Double insurancePrice, Double tollPrice,
                LocalDate endDateInspection, LocalDate endDateInsurance,
                LocalDate endDateToll,
                File talon, File invoiceFile) {
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice, localDate, supplier);
        this.razhNorma = razhNorma;
        this.insurance = insurance;
        this.number = number;
        this.repair = repair;
        this.inspection = inspection;
        this.toll = toll;
        this.inspectionPrice = inspectionPrice;
        this.insurancePrice = insurancePrice;
        this.tollPrice = tollPrice;
        this.endDateInspection = endDateInspection;
        this.endDateInsurance = endDateInsurance;
        this.talon = talon;
        this.invoiceFile = invoiceFile;
        this.endDateToll = endDateToll;
    }
}
