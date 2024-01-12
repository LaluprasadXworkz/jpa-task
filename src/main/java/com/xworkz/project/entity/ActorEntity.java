package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actor_info")
@Data
@AllArgsConstructor
public class ActorEntity {
//    A_id, A_name, A_age, recentMovie, language
    @Id
    @Column(name = "A_id")
    private int id;

    @Column(name = "A_name")
    private String name;

    @Column(name = "A_age")
    private int age;

    @Column(name = "recentMovie")
    private String recentMovie;

    @Column(name = "language")
    private  String language;
}
