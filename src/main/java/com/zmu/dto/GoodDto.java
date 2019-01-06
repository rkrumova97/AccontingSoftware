package com.zmu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class GoodDto {
    private Long id;
    private String name;
    private String measurement;
    private String quantity;
    private String price;
    private String totalPrice;
    private String numberOfInvoice;
}
