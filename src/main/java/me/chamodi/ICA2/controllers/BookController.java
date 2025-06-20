package me.chamodi.ICA2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.ICA2.models.Book;
import me.chamodi.ICA2.services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	public BookService service;
	
	@GetMapping("byGenre/{genre}")
	public ResponseEntity<List<Book>> getBookByGenre(@PathVariable("genre") String genre){
		return new ResponseEntity<List<Book>> (service.getBookByGenre(genre),HttpStatus.OK);
	}
	
}