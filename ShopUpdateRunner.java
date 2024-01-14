package com.xworkz.project.shop;

import com.xworkz.project.entity.ShopInfoEntity;
import com.xworkz.project.entity.TrafficFIneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        ShopInfoEntity shopInfoEntity = em.find(ShopInfoEntity.class, 5);
        if (shopInfoEntity != null) {
            shopInfoEntity.setAddress("ESI-123");
            shopInfoEntity.setGstNumber(789415623);
            shopInfoEntity.setPinCode(563247);
            em.merge(shopInfoEntity);
            System.out.println("Updated column :" + shopInfoEntity);
        } else {
            System.out.println("Invalid Id .!");
        }

        et.commit();
        System.out.println("Closing");
        em.close();
        emf.close();
    }
}
