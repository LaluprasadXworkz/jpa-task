package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports_info")
@Data
@AllArgsConstructor
public class SportsEntity {
//    S_id, S_Name, playerName, playerAge, Gender
    @Id
    @Column(name = "S_id")
    private int id;

    @Column(name = "S_Name")
    private String sportName;

    @Column(name = "playerName")
    private String playerName;

    @Column(name = "playerAge")
    private int age;

    @Column(name = "Gender")
    private String gender;
}
