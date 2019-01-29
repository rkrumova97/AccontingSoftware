package com.zmu.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class MaterialDto extends GoodDto{
    private String project;

    @Builder
    private MaterialDto(Long id, String name, String measurement, String quantity, String price, String numberOfInvoice, LocalDate date, String supplier, String project){
        super(id, name, measurement, quantity, price, numberOfInvoice, date, supplier);
        this.project = project;
    }
}
