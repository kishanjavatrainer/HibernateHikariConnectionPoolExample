package com.infotech.dao;

import org.hibernate.Session;

import com.infotech.entities.User;
import com.infotech.util.HibernateUtil;

public class UserDAO {

	public void createUser(User user) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
