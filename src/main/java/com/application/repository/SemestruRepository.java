package com.application.repository;

import com.application.entity.Semestru;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SemestruRepository extends CrudRepository<Semestru, Long> {
    Semestru findByNumarAndAnUniversitarId(Long semestru, Long an);
    List<Semestru> findByAnUniversitarId(Long an);
}
