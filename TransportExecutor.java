package com.xworkz.project.boot;

import com.xworkz.project.entity.TransportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TransportExecutor {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        TransportEntity transportEntity = new TransportEntity(1, "BMTC", 10, "Majestic", "ESI");
        em.persist(transportEntity);

        System.out.println("Data inserted");

        et.commit();
        System.out.println("Closing");

        em.close();
        emf.close();
    }
}
