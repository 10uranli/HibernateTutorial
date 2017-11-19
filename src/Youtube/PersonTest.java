package Youtube;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mysql.jdbc.Util;

import Util.Utilies;

public class PersonTest {

	 public static void main(String[] args) {
		 Person person = new Person("Onur",1);
		 SessionFactory sessionFactory = Utilies.getFactory();
		 Session session = sessionFactory.openSession();
		 Transaction  tf = session.beginTransaction();
		 session.save(person);
		 tf.commit();
		 session.close();
	}
}
