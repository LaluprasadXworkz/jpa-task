package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "traffic_info")
@Data
@Entity
@AllArgsConstructor
public class TrafficEntity {
//    T_id, T_Name, Location, T_Date, T_policeName
    @Id
    @Column(name = "T_id")
    private  int id;

    @Column(name = "T_Name")
    private String trafficeName;

    @Column(name = "Location")
    private String location;

    @Column(name = "T_Date")
    private String date;

    @Column(name = "T_policeName")
    private String policeName;

}
