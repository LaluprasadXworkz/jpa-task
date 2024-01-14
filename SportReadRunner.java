package com.xworkz.project.sport;

import com.xworkz.project.entity.ShopInfoEntity;
import com.xworkz.project.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SportReadRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        SportEntity sportEntity=em.find(SportEntity.class,2);
        System.out.println(sportEntity);
        System.out.println("closing..!");
        em.close();
        emf.close();
    }
}
