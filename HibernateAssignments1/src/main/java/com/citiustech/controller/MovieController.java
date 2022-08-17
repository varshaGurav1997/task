package com.citiustech.controller;
import java.util.*;

import com.citiustech.model.Movie;
import com.citiustech.service.*;
public class MovieController 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Movie m=new Movie();
		MovieService ms=new MovieServiceImpl();
		boolean flag=true;
		while(flag)
		{
			System.out.println("=========== Movie Details =============");
			System.out.println("1:Add Movie\n2:Get Movie Details\n3:Update Movie Details\n4:Delete Movie Details\n5:Exit");
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
						String movieId = ms.addMovie(m);
						System.out.println("Record "+movieId+" Added Successfully");
						break;
						
				case 2:
						Movie movie = ms.getMovieDetails();
						System.out.println("======================\n"+movie);
						
						break;
						
				case 3:
						ms.updateMovie();
						break;
						
				case 4:
						ms.deleteMovie();
						System.out.println(ms.getMovieDetails());
						break;
						
				case 5:
						System.exit(0);
						break;	
						
				default:break;
			}
			
		}
	}
}
