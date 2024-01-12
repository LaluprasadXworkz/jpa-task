package com.xworkz.project.boot;

import com.xworkz.project.entity.FilmEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FilmExecutor {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
    EntityManager em=emf.createEntityManager();
        System.out.println("EntityManager :"+em);
    EntityTransaction et= em.getTransaction();
        System.out.println("EntityTransaction :"+et);
    et.begin();
        System.out.println("Transaction Begin");
        FilmEntity filmEntity=new FilmEntity(1,"KGF","Hero-1","2022-04-12",8);
        FilmEntity filmEntity1=new FilmEntity(2,"KGF-2","Hero-1","2023-12-21",9);
    em.persist(filmEntity);
    em.persist(filmEntity1);
        System.out.println("Data inserted");
    et.commit();
        System.out.println("Transaction commit");


    em.close();
    emf.close();


    }
}
