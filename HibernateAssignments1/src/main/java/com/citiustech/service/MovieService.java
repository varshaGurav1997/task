package com.citiustech.service;

import com.citiustech.model.Movie;

public interface MovieService 
{
	public String addMovie(Movie m);
	public void deleteMovie();
	public void updateMovie();
	public Movie getMovieDetails();
	
}
