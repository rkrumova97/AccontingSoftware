package com.zmu.model;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "current_material")
public class CurrentMaterial extends Good{
    @OneToOne
    @JoinColumn(name = "project")
    private Project project;
}
