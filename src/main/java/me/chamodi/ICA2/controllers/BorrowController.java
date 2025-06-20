package me.chamodi.ICA2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.ICA2.models.Borrow;
import me.chamodi.ICA2.services.BorrowService;

@RestController
@RequestMapping("/borrow")
public class BorrowController{
	@Autowired
	public BorrowService service;
	
	@GetMapping("/{BookId}")
	public ResponseEntity<List<Borrow>> findStudentByBookId(@PathVariable("BookId") String id ){
		return new ResponseEntity<List<Borrow>> (service.findStudentByBookId(id),HttpStatus.OK);
	}
	
}