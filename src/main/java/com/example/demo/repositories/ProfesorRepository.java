package com.example.demo.repositories;

import com.example.demo.models.ProfesorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends CrudRepository<ProfesorModel, Integer> {
}
