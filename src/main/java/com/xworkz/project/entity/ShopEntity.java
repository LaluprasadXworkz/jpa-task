package com.xworkz.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop_info")
@Data
@AllArgsConstructor
public class ShopEntity {
//    S_id, S_name, ownerName, location, business
    @Id
    @Column(name = "S_id")
    private int id;

    @Column(name = "S_name")
    private String shopName;

    @Column(name = "ownerName")
    private String owerName;

    @Column(name = "location")
    private String location;

    @Column(name = "business")
    private String business;
}
