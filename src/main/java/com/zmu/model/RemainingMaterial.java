package com.zmu.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "remaining_material")
@AllArgsConstructor
@NoArgsConstructor
public class RemainingMaterial extends Good{
    @Column
    private GoodType goodType;
}
