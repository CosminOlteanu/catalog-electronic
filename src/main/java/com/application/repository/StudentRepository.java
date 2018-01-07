package com.application.repository;

import com.application.entity.Student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
	 List<Student> findByNume(String Nume);
}
