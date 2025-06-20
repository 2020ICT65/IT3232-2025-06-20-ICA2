package me.chamodi.ICA2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import me.chamodi.ICA2.models.Borrow;
import me.chamodi.ICA2.repo.BookRepo;
import me.chamodi.ICA2.repo.BorrowRepo;
import me.chamodi.ICA2.repo.StudentRepo;

@Service
public class BorrowService {
	@Autowired
	private BorrowRepo repo;
	private StudentRepo stuRepo;
	private BookRepo bookRepo;
	
	public List<Borrow> findStudentByBookId(String id){
		if(repo.findStudentByBookId(id).isEmpty()) {
			throw new EntityNotFoundException("No ellegible students found");
		}
		return repo.findStudentByBookId(id);
	}

	public String BorrowBook(String bid, String sid){
		if(stuRepo.findById(sid).isEmpty()){
			throw new EntityNotFoundException("No StudentFound");
		}
		if(bookRepo.findById(bid).isEmpty()){
			throw new EntityNotFoundException("No Book Found");
		}

		if(repo.unReturnBookCount(sid)>2){
			throw new EntityNotFoundException("Please return the books");
		}
		return "Book Borrowed";
	}
}
