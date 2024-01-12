package com.xworkz.project.boot;

import com.xworkz.project.entity.ResumeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.function.Predicate;

public class ResumeExecutor {
    public static void main(String[] args) {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    et.begin();
        ResumeEntity resumeEntity=new ResumeEntity(1,"Baba","bada@gmail.com","JSE","2000-07-25");
        em.persist(resumeEntity);
        System.out.println("Data inserted");
    et.commit();

    em.close();
    emf.close();
        System.out.println("closed");

    }

}
