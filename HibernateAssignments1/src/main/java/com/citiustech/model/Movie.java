package com.citiustech.model;

import javax.persistence.*;

@Entity
public class Movie 
{
	@Id
	private String movieId;
	private String movieName;
	private String language;
	private int releasedIn ;
	private int revenueInDollars;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getReleasedIn() {
		return releasedIn;
	}
	public void setReleasedIn(int releasedIn) {
		this.releasedIn = releasedIn;
	}
	public int getRevenueInDollars() {
		return revenueInDollars;
	}
	public void setRevenueInDollars(int revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}
	@Override
	public String toString() {
		return "Movie Id=" + movieId + " Movie Name=" + movieName + " Language=" + language + " ReleasedIn="
				+ releasedIn + " RevenueInDollars=" + revenueInDollars;
	}
	
}
