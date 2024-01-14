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
@Table(name = "shopinfo")
public class ShopInfoEntity {
    @Id
    @Column(name = "S_id")
    private int id;
    @Column(name = "S_Name")
    private String shopName;
    @Column(name = "Gst_No")
    private int gstNumber;
    @Column(name = "Address")
    private String address;
    @Column(name = "PinCode")
    private int pinCode;

    @Override
    public String toString() {
        return "ShopInfoEntity -" +
                "\nid :" + id +
                "\nshopName :" + shopName +
                "\ngstNumber :" + gstNumber +
                "\naddress :" + address +
                "\npinCode :" + pinCode ;
    }
}

