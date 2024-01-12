package com.xworkz.project.boot;


import com.xworkz.project.entity.ActorEntity;
import com.xworkz.project.entity.TransportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ActorExecutor {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        ActorEntity actorEntity=new ActorEntity(1,"Allu arjun",32,"Pushpa","telugu");
        em.persist(actorEntity);
        System.out.println("Data inserted");

        et.commit();
        System.out.println("Closing");

        em.close();
        emf.close();
    }
}
