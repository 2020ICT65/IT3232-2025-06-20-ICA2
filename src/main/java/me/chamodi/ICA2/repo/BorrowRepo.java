package me.chamodi.ICA2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import me.chamodi.ICA2.models.Borrow;

@Repository
public interface BorrowRepo extends JpaRepository<Borrow, Integer>{
	@Query("SELECT b FROM Borrow b WHERE b.book.id=?1")
	public List<Borrow> findStudentByBookId(String id);
	
}

