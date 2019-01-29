package com.zmu.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class MachineDto extends GoodDto{
    private String repair;
    private String scrapping;

    @Builder
    private MachineDto(Long id, String name, String measurement, String quantity, String price, String numberOfInvoice, LocalDate localDate, String supplier, String repair, String scrapping){
        super(id, name, measurement, quantity, price, numberOfInvoice, localDate, supplier);
        this.repair=repair;
        this.scrapping=scrapping;
    }
}
