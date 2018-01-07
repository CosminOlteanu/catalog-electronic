package com.application.repository;

import com.application.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByNumeAndCnp(String nume, String cnp);
}
