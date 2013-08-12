package DAO;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import model.User;

public class TestDAO {

	public void test()
	{
		SessionFactory sesseionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sesseionFactory.openSession();
		session.beginTransaction();
		User user = new User();
		user.setUserName("test");
		user.setUserPWD("test");
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		User ur = dao.getUser("mjx");
	}

}
