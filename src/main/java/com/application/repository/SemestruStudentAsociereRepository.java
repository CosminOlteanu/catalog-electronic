package com.application.repository;

import com.application.entity.StudentSemestruAsociere;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SemestruStudentAsociereRepository extends CrudRepository<StudentSemestruAsociere, Long> {

    StudentSemestruAsociere findByStudentIdAndAndInCursTrue(long studentId);
    List<StudentSemestruAsociere> findByStudentId(long studentId);
}
