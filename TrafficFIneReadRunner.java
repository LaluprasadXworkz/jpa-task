package com.xworkz.project.trafficefine;

import com.xworkz.project.entity.TrafficFIneEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TrafficFIneReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        TrafficFIneEntity trafficFIneEntity = (TrafficFIneEntity)em.find(TrafficFIneEntity.class, 1);
        System.out.println(trafficFIneEntity);
        System.out.println("closing..!");
        em.close();
        emf.close();
    }
}
