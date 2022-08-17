package com.citiustech.service;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.citiustech.model.Movie;

public class MovieServiceImpl implements MovieService
{
	Scanner sc=new Scanner(System.in);
	Configuration config=new Configuration().configure("hibernate.cfg.xml");
	public String addMovie(Movie m) 
	{
		Session session = config.buildSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter MovieId");
		String movieId=sc.next();
		
		System.out.println("Enter Movie Name");
		String movieName=sc.next()+sc.next();
		
		System.out.println("Enter Language");
		String language=sc.next();
		
		System.out.println("Enter Released In");
		int releasedIn=sc.nextInt();
		
		System.out.println("Enter Revenue In Dollars");
		int revenueInDollars=sc.nextInt();
		
		m.setMovieId(movieId);
		m.setMovieName(movieName);
		m.setLanguage(language);
		m.setReleasedIn(releasedIn);
		m.setRevenueInDollars(revenueInDollars);
		session.save(m);
		session.getTransaction().commit();
		session.close();
		return m.getMovieId();
	}

	public void deleteMovie() 
	{
		Session session = config.buildSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter Movie Id");
		String movieId=sc.next();
		Movie m = session.load(Movie.class, movieId);
		session.delete(m);
		session.getTransaction().commit();
		session.close();
	}

	public void updateMovie() 
	{
		Session session = config.buildSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter Movie Id");
		String movieId=sc.next();
		Movie m = session.load(Movie.class, movieId);
		m.setRevenueInDollars(m.getRevenueInDollars()+100000);
		session.saveOrUpdate(m);
		System.out.println("========= Updated Information ========");
		System.out.println(m);
		session.getTransaction().commit();
		session.close();
		System.out.println(m);
		
	}

	public Movie getMovieDetails() 
	{
		Session session = config.buildSessionFactory().openSession();
		System.out.println("Enter Movie Id");
		String movieId=sc.next();
		Movie m = session.load(Movie.class, movieId);
		return m;
	}

}
