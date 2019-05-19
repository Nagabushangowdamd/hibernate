package com.jspiders.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspiders.dto.Address;
import com.jspiders.dto.Vehichle;
import com.jspiders.dto.userDetails128;




public class HibernateTest {

	public static void main(String[] args) {
		
		userDetails128 user= new userDetails128();
		user.setUserName("vishal");
		user.setJoinedDate(new Date());
		
        
	SessionFactory sessionFactory=	new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();

	session.save(user);
  session.getTransaction().commit();	
	session.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}