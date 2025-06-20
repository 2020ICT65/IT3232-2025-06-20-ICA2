package me.chamodi.ICA2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import me.chamodi.ICA2.models.Book;
import me.chamodi.ICA2.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo repo;
	
	public List<Book> getBookByGenre(String genre){
		if(repo.getBookByGenre(genre).isEmpty()) {
			throw new EntityNotFoundException("No books found");
		}
		return repo.getBookByGenre(genre);
	}
}