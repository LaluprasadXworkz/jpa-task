package com.xworkz.project.shop;


import com.xworkz.project.entity.ShopInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ShopReadRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        ShopInfoEntity shopInfoEntity = em.find(ShopInfoEntity.class, 1);
        System.out.println(shopInfoEntity);
        System.out.println("closing..!");
        em.close();
        emf.close();

    }
}
