package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(101);
        l1.setBrand("Acer");
        l1.setModel("nitro 5");
        l1.setRam(8);

        Laptop l2 = new Laptop();
        l2.setLid(102);
        l2.setBrand("Hp");
        l2.setModel("hp victus");
        l2.setRam(16);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(l1);
        laptops.add(l2);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setName("Sachin");
        a1.setTech("java");
        a1.setLaptops(laptops);

        l1.setAlien(a1);
        l2.setAlien(a1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(a1);

        transaction.commit();


        session.close();
        sf.close();
        System.out.println(a1);
    }
}