package com.seleniumexpress.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.models.Passport;

import com.seleniumexpress.models.Student;

public class HibernateUtils {

	private HibernateUtils() {

	}

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		try {
			if (sessionFactory == null) {
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(Student.class);
				cfg.addAnnotatedClass(Passport.class);
				sessionFactory = cfg.buildSessionFactory();
			}
		} catch (Exception e) {
			System.out.print("Session Factory Object can not be created :: " + e.getMessage());
			e.printStackTrace();
		}

		return sessionFactory;
	}
}
