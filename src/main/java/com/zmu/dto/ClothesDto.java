package com.zmu.dto;

import com.zmu.model.Type;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClothesDto extends GoodDto{
    private String type;
    private String number;
    private Boolean given;
    private Boolean used;

    @Builder
    private ClothesDto(Long id, String name, String measurement, String quantity, String price, String numberOfInvoice, LocalDate localDate, String supplier, String type, String number, Boolean given, Boolean used){
        super(id, name, measurement, quantity, price, numberOfInvoice,localDate,supplier);
        this.given=given;
        this.number=number;
        this.type=type;
        this.used=used;
    }
}
