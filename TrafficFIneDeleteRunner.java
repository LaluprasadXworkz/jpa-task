package com.xworkz.project.trafficefine;

import com.xworkz.project.entity.TrafficFIneEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFIneDeleteRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        TrafficFIneEntity trafficFIneEntity = (TrafficFIneEntity)em.find(TrafficFIneEntity.class, 5);
        if (trafficFIneEntity != null) {
            em.remove(trafficFIneEntity);
            System.out.println("Data deleted ..!");
        } else {
            System.out.println("Data not removied");
        }

        et.commit();
        em.close();
        emf.close();
    }
}

