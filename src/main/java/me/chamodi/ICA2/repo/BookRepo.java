package me.chamodi.ICA2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import me.chamodi.ICA2.models.Book;
@Repository
public interface BookRepo extends JpaRepository<Book, String>{
	@Query("SELECT b FROM Book b WHERE b.genre like %?1%")
	public List<Book> getBookByGenre(String genre);
	
}
