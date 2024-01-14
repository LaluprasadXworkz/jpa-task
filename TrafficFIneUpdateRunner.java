package com.xworkz.project.trafficefine;

import com.xworkz.project.entity.TrafficFIneEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFIneUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        TrafficFIneEntity trafficFIneEntity = (TrafficFIneEntity)em.find(TrafficFIneEntity.class, 3);
        if (trafficFIneEntity != null) {
            trafficFIneEntity.setViolation("Accident");
            trafficFIneEntity.setOwnerName("Amazon");
            trafficFIneEntity.setFine(100000);
            em.merge(trafficFIneEntity);
            System.out.println("Updated column :" + trafficFIneEntity);
        } else {
            System.out.println("Invalid Id .!");
        }

        et.commit();
        System.out.println("Closing");
        em.close();
        emf.close();
    }
}

