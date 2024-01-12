package com.xworkz.project.boot;

import com.xworkz.project.entity.SportsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsExecutor {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        et.begin();
        SportsEntity sportsEntity=new SportsEntity(1,"cricket","Rohit",36,"Male");
        em.persist(sportsEntity);
        System.out.println("Data inserting");
        et.commit();
        System.out.println("Closing");
        em.close();
        emf.close();

    }
}
