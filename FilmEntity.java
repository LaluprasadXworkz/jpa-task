package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "film_info")
@Entity
@Data
@AllArgsConstructor
public class FilmEntity {
//    m_id, m_Name, m_heroName, m_releaseDate, rating
    @Id
    @Column(name = "m_id")
    private int id;

    @Column(name = "m_Name")
    private  String movieName;

    @Column(name = "m_heroName")
    private String heroName;

    @Column(name = "m_releaseDate")
    private String releaseDate;

    @Column(name = "rating")
    private  int rating;

}
