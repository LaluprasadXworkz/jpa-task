package com.xworkz.project.sport;



import com.xworkz.project.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        SportEntity sportEntity=em.find(SportEntity.class,5);
        if (sportEntity != null) {
            sportEntity.setCaptionName("Rinku singe");
            em.merge(sportEntity);
            System.out.println("Updated column :" + sportEntity);
        } else {
            System.out.println("Invalid Id .!");
        }

        et.commit();
        System.out.println("Closing");
        em.close();
        emf.close();
    }
}
