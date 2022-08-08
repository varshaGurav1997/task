package com.ms.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ms.model.Student;
import com.ms.util.HibernateUtil;
///HibernateEx1/src/main/java/resources/hibernate.cfg.xml
public class Client {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Student student=new Student();
//		student.setId(105);
//		student.setName("raj105");
//		student.setEmail("raj105@gmail.com");
//		
//		session.beginTransaction();
//		session.save(student);   //insert
//		session.getTransaction().commit();
//		
		
		System.out.println("Reading values from Student");
		Student s1=session.load(Student.class, 105);
		System.out.println(s1);
		
		
		
		

	}

}