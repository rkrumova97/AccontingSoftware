package com.zmu.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class CarDto extends GoodDto {
    private String razhNorma;
    private String number;
    private String repair;
    private String inspection;
    private String insurance;
    private String toll;
    private String inspectionPrice;
    private String insurancePrice;
    private String tollPrice;
    private LocalDate endDateInspection;
    private LocalDate endDateInsurance;
    private LocalDate endDateToll;
    private File talon;
    private File invoiceFile;

    @Builder
    private CarDto(Long id, String name, String measurement, String quantity, String price, String numberOfInvoice, LocalDate localDate, String supplier,
                   String razhNorma,
                   String number, String repair,
                   String inspection, String insurance,
                   String toll, String inspectionPrice,
                   String insurancePrice, String tollPrice,
                   LocalDate endDateInspection, LocalDate endDateInsurance,
                   File talon, File invoiceFile, LocalDate endDateToll) {
        super(id, name, measurement, quantity, price, numberOfInvoice, localDate, supplier);
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
