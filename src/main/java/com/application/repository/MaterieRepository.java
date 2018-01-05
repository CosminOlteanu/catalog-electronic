package com.application.repository;

import com.application.entity.Materie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MaterieRepository extends CrudRepository<Materie, Long> {
    List<Materie> findByGroupaIdAndSemestruId(long grupaId, long semestruId);
}
