package com.example.demo.repositories;

import com.example.demo.models.EstudianteGrupoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteGrupoRepository extends CrudRepository<EstudianteGrupoModel, Integer> {
}
