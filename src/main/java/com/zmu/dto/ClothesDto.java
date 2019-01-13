package com.zmu.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClothesDto extends GoodDto{
    @Builder
    private ClothesDto(Long id, String name, String measurement, String quantity, String price, String totalPrice, String numberOfInvoice){
        super(id, name, measurement, quantity, price, totalPrice, numberOfInvoice);
    }
}
