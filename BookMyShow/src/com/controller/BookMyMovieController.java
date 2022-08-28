package com.controller;

import com.model.BookMyMovie;

public class BookMyMovieController {
	public static void main(String[] args) {
		
		BookMyMovie b1 = new BookMyMovie(101, 6);
		System.out.println("Total booking amount: "+b1.calculateTicketAmount());
		BookMyMovie b2 = new BookMyMovie(102, 5);
		System.out.println("Total booking amount: "+b2.calculateTicketAmount());
		BookMyMovie b3 = new BookMyMovie(103, 9);
		System.out.println("Total booking amount: "+b3.calculateTicketAmount());

	}


}
