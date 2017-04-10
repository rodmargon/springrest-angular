package com.mycompany.springrest.springrest_angular.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.springrest.springrest_angular.domain.Film;

@RestController
@RequestMapping(value = "/films")
public class FilmsController {

	private static final List<Film> DUMMY_FILMS = new ArrayList<Film>();
	
	static {
		DUMMY_FILMS.add(new Film("The arrival", "Denis Villeneuve",2016));
		DUMMY_FILMS.add(new Film("LalalaLand",  "Damien Chazelle", 2016));
		DUMMY_FILMS.add(new Film("Moonlight",  "Barry Jenkins", 2016));
		DUMMY_FILMS.add(new Film("Manchester frente al mar","Kenneth Lonergan", 2016));
		DUMMY_FILMS.add(new Film("Zootropolis", "Byron Howard, Rich Moore", 2016));
		DUMMY_FILMS.add(new Film("Suicide Squad", "David Ayer", 2016));
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Film> getFilms() {
		return DUMMY_FILMS;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addFilm(@RequestBody @Valid Film film) {
		DUMMY_FILMS.add(film);
	}
}
