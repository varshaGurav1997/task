package com.training;

import java.sql.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Customer;
import com.model.Locker;
import com.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer c = new Customer();
		c.setCustId(1001);
		c.setCustName("Ajay");
		c.setCustDOB(new Date(1995, 1, 5));
		c.setCustAdd("Pune");
		c.setCustPhone("7700330022");

		Locker l = new Locker();
		l.setLockerId("loc105");
		l.setLockerType("large");
		l.setRent(1500);

		c.setLocker(l);

		
		//session.save(l); 
		System.out.println("Record inserted in Locker successfully");
		session.save(c); 
		System.out.println("Record inserted in Customer successfully");
		System.out.println("----------------------");
//		Customer customer = session.get(Customer.class, 7003);
//		
//		System.out.println(customer);
//		
		t.commit();
//
		session.close();

	}
}
