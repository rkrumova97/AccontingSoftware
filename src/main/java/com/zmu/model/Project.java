package com.zmu.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    private String name;

    @Column
    private String company;

    @Column
    private String city;

    @Column
    private Double outcomes;

    @Column
    private Double incomes;
}
