package com.zmu.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "fuel")
public class Fuel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    private String name;

    @Column
    @Setter(AccessLevel.NONE)
    private Double litre;

    @Column
    private Double price;

    public void setLitre(Car car) {
        litre = car.getKilometers() / 100 * car.getRazhNorma();
    }
}
