package com.epam.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Design Patterns");
		
		System.out.println(movie);
		System.out.println(movie.getUrl());
		System.out.println(movie.getTitle());
		System.out.println(movie.getRuntime());
	}

}
