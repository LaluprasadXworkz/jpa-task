package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trafficfine_info")
public class TrafficFIneEntity {
    @Id
    @Column(name = "T_id")
    private int id;
    @Column(name = "Violation")
    private String violation;
    @Column(name = "vehicleNo")
    private String vehicleNumber;
    @Column(name = "OwnerName")
    private String ownerName;
    @Column(name = "fine")
    private int fine;

    public String toString() {
        return "Traffic FIne Entity -\nid :" + this.id + "\nviolation :" + this.violation + "\nVehicle Number :" + this.vehicleNumber + "\nOwner Name :" + this.ownerName + "\nFine :" + this.fine;
    }
}

