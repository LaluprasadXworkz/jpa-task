package com.xworkz.project.sport;



import com.xworkz.project.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportCreateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        SportEntity sportEntity=new SportEntity(1,"Football","England","Caption-1",11);
        SportEntity sportEntity1=new SportEntity(2,"Basketball","United States","Caption-2",5);
        SportEntity sportEntity2=new SportEntity(3,"Cricket","India","Rohit",11);
        SportEntity sportEntity3=new SportEntity(4,"Volleyball","India","Caption-3",6);
        SportEntity sportEntity4=new SportEntity(5,"Badminton","Sri lanka","Caption-4",2);
        em.persist(sportEntity);
        em.persist(sportEntity1);
        em.persist(sportEntity2);
        em.persist(sportEntity3);
        em.persist(sportEntity4);

        System.out.println("Data inserted..!");
        et.commit();
        System.out.println("Closing..!");
        em.close();
        emf.close();
    }
}
