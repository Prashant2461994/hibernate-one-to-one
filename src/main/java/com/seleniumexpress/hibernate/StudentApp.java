package com.seleniumexpress.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumexpress.models.Passport;
import com.seleniumexpress.utils.HibernateUtils;

/**
 * Hello world!
 *
 */
public class StudentApp {

	private static Session session = null;

	public static void main(String[] args) {

		// 1. create configuration
		// 2. create session factory
		// 3. initialize the session object

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		/*
		 * Passport sreejaPassport = new Passport("AGXPT7596Q123"); Student
		 * sreejaStudent = new Student("Felix", "SA", sreejaPassport);
		 */
		transaction.begin();
		// session.save(sreejaPassport);

		Passport passport = session.get(Passport.class, 1);
        System.out.println(passport.getStudent().getName());
		transaction.commit();

		session.close();
		sessionFactory.close();

	}

}
