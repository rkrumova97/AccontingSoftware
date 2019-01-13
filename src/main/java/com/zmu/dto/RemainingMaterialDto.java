package com.zmu.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RemainingMaterialDto extends GoodDto{
    @Builder
    private RemainingMaterialDto(Long id, String name, String measurement, String quantity, String price, String totalPrice, String numberOfInvoice){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice);
    }
}
