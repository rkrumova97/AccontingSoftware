package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "machine")
@AllArgsConstructor
@NoArgsConstructor
public class Machine extends Good {
    @Column
    private String type;

    @Column
    private String repair;

    @Column
    private String scrapping;
}
