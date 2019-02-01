package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

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
    private Date repairDate;

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
    private Double kilometers;

    @Column
    @Setter(AccessLevel.NONE)
    private Double fuel;

    @Column
    private Double fuelPrice;

    @Column
    private Double fuelTotalPrice;

    @Builder
    private Car(Long id, String name, String measurement, Double quantity, Double price, Double totalPrice, Integer numberOfInvoice, LocalDate localDate, String supplier,
                Integer razhNorma,
                Integer number, String repair,
                String inspection, String insurance,
                String toll, Double inspectionPrice,
                Double insurancePrice, Double tollPrice,
                LocalDate endDateInspection, LocalDate endDateInsurance,
                LocalDate endDateToll, Date repairDate) {
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
        this.endDateToll = endDateToll;
        this.repairDate = repairDate;
    }

    public void setFuel(Boolean moto) {
        if (moto) {
            fuel = kilometers * 5;
        } else fuel = kilometers / 100 * razhNorma;
    }
}
