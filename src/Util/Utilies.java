package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utilies {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}
}
