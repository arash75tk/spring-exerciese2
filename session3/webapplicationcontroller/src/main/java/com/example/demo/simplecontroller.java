package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class simplecontroller {
	public simplecontroller() {
		super();
	}
	
	@GetMapping(value = "/books")
	public String books() {
		return "this returns list of book";
	}
	
	@PostMapping(value = "/books/create")
	public String createbook() {
		return "send book to server";
	}
	
	@GetMapping(value = "/books/{id}")
	public String get(@PathVariable long id) {
		return "get book with id : " + id;
	}
	
	@PutMapping(value = "/books/{id}")
	public String put(@PathVariable long id) {
		return "update book with id: " + id;
	}
	
	@DeleteMapping(value= "books/{id}")
	public String deleteBook(@PathVariable long id) {
		return "delete book with id: " + id;
	}
	
	@GetMapping(value="books/title/{title}")
	public String gettitle(@PathVariable String title) {
		return "title of the book is : " + title;
	}
	@GetMapping(value="books/name/{name}")
	public String getname(@PathVariable String name) {
		return "name of the book is : " + name;
	}
}
