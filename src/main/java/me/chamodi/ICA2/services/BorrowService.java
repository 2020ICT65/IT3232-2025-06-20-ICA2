package me.chamodi.ICA2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import me.chamodi.ICA2.models.Borrow;
import me.chamodi.ICA2.repo.BorrowRepo;

@Service
public class BorrowService {
	@Autowired
	private BorrowRepo repo;
	
	public List<Borrow> findStudentByBookId(String id){
		if(repo.findStudentByBookId(id).isEmpty()) {
			throw new EntityNotFoundException("No ellegible students found");
		}
		return repo.findStudentByBookId(id);
	}
}
