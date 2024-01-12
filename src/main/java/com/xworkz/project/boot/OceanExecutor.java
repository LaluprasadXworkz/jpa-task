package com.xworkz.project.boot;

import com.xworkz.project.entity.FestivalEntity;
import com.xworkz.project.entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OceanExecutor {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        OceanEntity oceanEntity=new OceanEntity(1,"Indian Ocean","India","salt","27240000sqmi");
        em.persist(oceanEntity);
        System.out.println("Data inserted");

        et.commit();
        System.out.println("Closing");

        em.close();
        emf.close();
    }
}
