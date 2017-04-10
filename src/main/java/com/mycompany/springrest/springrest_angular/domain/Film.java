package com.mycompany.springrest.springrest_angular.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Film {

	@NotEmpty
	private String title;
	
	@NotEmpty
	private String director;
	
	@NotNull
	private Integer year;
	
	private Film() {
	}
	
	public Film(String title, String director, Integer year) {
		
		this.title = title;
		this.director = director;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public Integer getYear() {
		return year;
	}

}