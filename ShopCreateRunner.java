package com.xworkz.project.shop;

import com.xworkz.project.entity.ShopInfoEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopCreateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        ShopInfoEntity shopInfoEntity = new ShopInfoEntity(4, "Cutting shope", 984786123, "Majestic", 564789);
        ShopInfoEntity shopInfoEntity1 = new ShopInfoEntity(5, "fruits shop", 129456123, "Rajaji nagar", 564852);
        em.persist(shopInfoEntity);
        em.persist(shopInfoEntity1);
        System.out.println("Data inserted..!");
        et.commit();
        System.out.println("Closing..!");
        em.close();
        emf.close();
    }
}

