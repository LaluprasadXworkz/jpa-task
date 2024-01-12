package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transport_info")
@Data
@AllArgsConstructor
public class TransportEntity {
    // T_id, T_name, Cost, pickUp, Drop
    @Id
    @Column(name = "T_id")
    private int id;

    @Column(name = "T_name")
    private String transportName;

    @Column(name = "Cost")
    private int cost;

    @Column(name = "pickUp")
    private String pickUp;

    @Column(name = "Droplocation")
    private String drop;
}
