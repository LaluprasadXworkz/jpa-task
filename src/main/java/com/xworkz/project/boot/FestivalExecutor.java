package com.xworkz.project.boot;

import com.xworkz.project.entity.ActorEntity;
import com.xworkz.project.entity.FestivalEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FestivalExecutor {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        FestivalEntity festivalEntity=new FestivalEntity(1,"Shivaratre","Shiva","2024-01-16","Sweet-1");
        em.persist(festivalEntity);
        System.out.println("Data inserted");

        et.commit();
        System.out.println("Closing");

        em.close();
        emf.close();
    }
}
