package com.InternetBanking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.InternetBanking.entity.User;
import com.InternetBanking.helper.FactoryProvider;

public class LoginDao {
	private SessionFactory factory;
	
	public LoginDao(SessionFactory factory) {
		super();
		this.factory=factory;
		System.out.println("Database connection"+factory);
		
	}
	public User getUserByEmailAndPassword(String email, String password) {
		User user=null;
		try {
			String query="from User where email=: e and password=: p";
			Session session = this.factory.openSession();
			Query query2 = session.createQuery(query);
			query2.setParameter("e", email);
			query2.setParameter("p", password);
			 user=(User) query2.uniqueResult();
			 System.out.println("User"+user);
			 return user;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
		
	}
	
}
