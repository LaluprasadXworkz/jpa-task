package com.xworkz.project.trafficefine;

import com.xworkz.project.entity.TrafficFIneEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFIneCreateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        TrafficFIneEntity trafficFIneEntity = new TrafficFIneEntity(4, "Parking", "AP 04 AV 2556", "Owner-4", 100);
        TrafficFIneEntity trafficFIneEntity1 = new TrafficFIneEntity(5, "Signal pass", "TN 02 QW 7894", "Owner-5", 250);
        em.persist(trafficFIneEntity);
        em.persist(trafficFIneEntity1);
        System.out.println("Data insereted..!");
        et.commit();
        System.out.println("Closing..!");
        em.close();
        emf.close();
    }
}
