package com.InternetBanking.dao;



import java.io.Serializable;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.InternetBanking.entity.User;
import com.InternetBanking.helper.FactoryProvider;

public class RegisterDao {
	
	public int getUserDetailsForRegister(User user) {
		Session hibernateSession = FactoryProvider.getFactory().openSession();
		Transaction transaction = hibernateSession.beginTransaction();
		int id = (Integer) hibernateSession.save(user);
		transaction.commit();
		hibernateSession.close();
		return id;
	}
}
