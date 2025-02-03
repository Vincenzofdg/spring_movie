package com.br.study.movies;

import com.br.study.movies.service.IMDB;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Override
	public void run(String... args) {
		IMDB getDataFromApi = new IMDB();
		var json = getDataFromApi.fetchApiData("http://www.omdbapi.com/?t=the+boys&Season=1&apikey=89fb62ff");
		System.out.println(json);
	}
}
