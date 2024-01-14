package com.xworkz.project.shop;

import com.xworkz.project.entity.ShopInfoEntity;
import com.xworkz.project.entity.TrafficFIneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        ShopInfoEntity shopInfoEntity = em.find(ShopInfoEntity.class, 3);
        if (shopInfoEntity != null) {
            em.remove(shopInfoEntity);
            System.out.println("Data deleted ..!");
        } else {
            System.out.println("Data not removied");
        }

        et.commit();
        em.close();
        emf.close();
    }
}
