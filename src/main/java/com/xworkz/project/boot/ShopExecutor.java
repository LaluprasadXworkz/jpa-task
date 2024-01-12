package com.xworkz.project.boot;

import com.xworkz.project.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopExecutor {
    public static void main(String[] args) {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    EntityManager em= emf.createEntityManager();
    EntityTransaction et= em.getTransaction();
        et.begin();
        ShopEntity shopEntity=new ShopEntity(1,"Medical Shop","Ower-1","Basam circle","tablets");
        em.persist(shopEntity);
        System.out.println("Data inserting");
        et.commit();
        System.out.println("Closing");
    em.close();
    emf.close();

    }
}
