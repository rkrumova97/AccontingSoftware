package com.zmu.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MaterialDto extends GoodDto{
    private String project;

    @Builder
    private MaterialDto(Long id, String name, String measurement, String quantity, String price, String totalPrice, String numberOfInvoice, String project){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice);
        this.project = project;
    }
}
