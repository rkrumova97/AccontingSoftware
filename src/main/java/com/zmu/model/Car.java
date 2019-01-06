package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "car")
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Good {
    @Column
    private Long number;

    @Column
    private String repair;

    @Column
    private String inspection;

    @Column
    private String insurance;

    @Column
    private Date endDateInspection;

    @Column
    private Date endDateInsurance;


}
