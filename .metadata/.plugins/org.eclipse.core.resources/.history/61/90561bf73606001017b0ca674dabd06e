package com.hibernate.OneToMany;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.setId(1);
		l1.setBrand("Asus");
		l1.setModel("Rog");
		l1.setRam(16);
		
		
		Laptop l2 = new Laptop();
		l2.setId(2);
		l2.setBrand("Dell");
		l2.setModel("XPS");
		l2.setRam(32);
		

		Alien alien = new Alien();
		alien.setAlien_Id(101);
		alien.setName("Navin");
		alien.setTech("Java");
		alien.setLaptop(Arrays.asList(l1,l2));
		
		l1.setAlien(alien);
		l2.setAlien(alien);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(com.hibernate.OneToMany.Alien.class);
		configuration.addAnnotatedClass(com.hibernate.OneToMany.Laptop.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(l1);
		session.save(l2);
		session.save(alien);
		
		transaction.commit();
		
		System.out.println(l1);
		System.out.println(alien);
	}
}
