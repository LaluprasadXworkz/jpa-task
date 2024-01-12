package com.xworkz.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resume_info")
@Data
@AllArgsConstructor


public class ResumeEntity {
//    R_id, name, mailID, Designation, DOB
    @Id
    @Column(name = "R_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "mailID")
    private String mailId;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "DOB")
    private  String dob;
}
