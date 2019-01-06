package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "clothes")
@AllArgsConstructor
@NoArgsConstructor
public class Clothes extends Good{
    @Column
    private Type type;

    @Column
    private String type1;

    @Column
    private Long number;

    @Column
    private Boolean given;

    @Column
    private Boolean used;
}
