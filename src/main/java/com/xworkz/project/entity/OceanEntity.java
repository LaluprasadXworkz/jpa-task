package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocean_info")
@Data
@AllArgsConstructor

public class OceanEntity {
//    O_id, O_Name, CountryName, watertype, waterlevel
    @Id
    @Column(name = "O_id")
    private int id;

    @Column(name = "O_Name")
    private String name;

    @Column(name = "CountryName")
    private String countryName;

    @Column(name = "watertype")
    private String waterType;

    @Column(name = "waterlevel")
    private String waterLevel;
}
