package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sportsinfo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SportEntity {
//    S_id, sportName, OriginCountry, captionName, totalPlayer
    @Id
    @Column(name = "S_id")
    private int id;

    @Column(name = "sportName")
    private String sportName;

    @Column(name = "OriginCountry")
    private String originCountry;

    @Column(name = "captionName")
    private String captionName;

    @Column(name = "totalPlayer")
    private int totalPlayer;

    @Override
    public String toString() {
        return "SportEntity -" +
                "\nid :" + id +
                "\nsportName :" + sportName +
                "\noriginCountry :" + originCountry +
                "\ncaptionName :" + captionName +
                "\ntotalPlayer :" + totalPlayer ;
    }
}
