package com.xworkz.project.boot;

import com.xworkz.project.entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficExecutor {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        //    T_id, T_Name, Location, T_Date, T_policeName

        TrafficEntity trafficEntity = new
                TrafficEntity(1, "Basm circle", "Bengaluru", "2024-01-11", "Police-1");
        em.persist(trafficEntity);
        System.out.println("Data inserted");

        et.commit();
        System.out.println("Closing");
        em.close();
        emf.close();
    }
}
