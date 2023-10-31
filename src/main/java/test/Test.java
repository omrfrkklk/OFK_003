package test;

import model.OgrenciEntity;

import javax.persistence.*;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ofk");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        OgrenciEntity ogrenciEntity = entityManager.find(OgrenciEntity.class, 1);
        if (ogrenciEntity != null)
            System.err.println(ogrenciEntity.toString());

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        entityManager.persist(new OgrenciEntity(1,"ömer","kelek","TR"));

        entityTransaction.commit();
    }
}
