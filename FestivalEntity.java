package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "festival_info")
@Data
@AllArgsConstructor
public class FestivalEntity {
//    F_id, F_name, Godname, F_Date, sweet_Name
    @Id
    @Column(name = "F_id")
    private int id;

    @Column(name = "F_name")
    private String name;

    @Column(name = "Godname")
    private String godName;

    @Column(name = "F_Date")
    private String festivalDate;

    @Column(name = "sweet_Name")
    private String sweetName;
}
