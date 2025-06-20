package me.chamodi.ICA2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.chamodi.ICA2.models.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, String>{
	
    
}

