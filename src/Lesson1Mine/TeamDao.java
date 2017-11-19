package Lesson1Mine;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mysql.jdbc.Util;

import Lesson1.Employee;
import Util.Utilies;

public class TeamDao implements ITeamDao {

	@Override
	public int insert(String name) {
		SessionFactory sf = Utilies.getFactory();
		Session session = sf.openSession();
		Transaction tx = null;
		int teamID = 0;

		try {
			tx = session.beginTransaction();
			Team employee = new Team(name);
			teamID = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return teamID;
	}

	@Override
	public void update(int teamId, String teamName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int teamId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Team find(int teamId) {
		SessionFactory sf = Utilies.getFactory();
		Session session = sf.openSession();
		Team team = session.get(Team.class, teamId);
		return team;
	}

}
