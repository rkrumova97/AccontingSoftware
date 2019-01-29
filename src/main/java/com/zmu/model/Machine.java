package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "machine")
@AllArgsConstructor
@NoArgsConstructor
public class Machine extends Good {
    @Column
    private String repair;

    @Column
    private LocalDate repairDate;

    @Column
    private Double repairPrice;

    @Column
    private Boolean isScrapped;

    @Builder
    private Machine(Long id, String name, String measurement, Double quantity, Double price, Double totalPrice, Integer numberOfInvoice, LocalDate localDate, String supplier, String repair, LocalDate repairDate, Double repairPrice, Boolean iScrapped){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice, localDate, supplier);
        this.isScrapped=iScrapped;
        this.repair=repair;
        this.repairDate = repairDate;
        this.repairPrice=repairPrice;

    }
}
