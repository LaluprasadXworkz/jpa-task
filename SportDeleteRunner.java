package com.xworkz.project.sport;

import com.xworkz.project.entity.SportEntity;
import com.xworkz.project.entity.TrafficFIneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        SportEntity sportEntity=em.find(SportEntity.class,3);
        if (sportEntity != null) {
            em.remove(sportEntity);
            System.out.println("Data deleted ..!");
        } else {
            System.out.println("Data not removied");
        }

        et.commit();
        em.close();
        emf.close();
    }
}
