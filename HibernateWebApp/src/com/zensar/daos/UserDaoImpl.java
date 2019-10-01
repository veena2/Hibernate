package com.zensar.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

/**
 * @author Veena Kumari
 * @version 2.0
 * @creation_date 21/sep/2019 5.36pm
 * @modification_date 28/sep/2019 11:15am
 * @copyright Zensar Technologies, India. All rights reserved
 * 				
 * 				
 */


public class UserDaoImpl implements UserDao {

	private Session session;
	public UserDaoImpl() {
		Configuration c=new Configuration().configure();
		SessionFactory f=c.buildSessionFactory();
		session=f.openSession();
		
	}
	@Override
	public void insert(User user) {
		Transaction t=session.beginTransaction();
		session.save(user);
		t.commit();
	}
	@Override
	public void update(User user) {
		Transaction t=session.beginTransaction();
		session.update(user);
		t.commit();

	}
	@Override
	public void delete(User user) {
		Transaction t=session.beginTransaction();
		session.delete(user);
		t.commit();

	}
	@Override
	public User getByUsername(String username) {
		return session.get(User.class, username);
	}
	@Override
	public List<User> getAll() {
		Query q=session.createQuery("from User");
		return q.getResultList();
	}
	
}
